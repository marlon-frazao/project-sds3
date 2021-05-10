import axios from 'axios';
import { useEffect, useState } from 'react';
import Chart from 'react-apexcharts';
import { SaleSuccess } from 'types/sale';
import { round } from 'utils/format';
import { BASE_URL } from 'utils/requests';
import BarChartLoader from '../BarChartLoader';

type SeriesData = {
    name: string;
    data: number[];
}
type ChartData = {
    labels: {
        categories: string[];
    };
    series: SeriesData[];
}
const BarChart = () => {

    const [isLoading, setIsLoading] = useState(false);
    const [chartData, setChartData] = useState<ChartData>({
        labels: {
            categories: []
        },
        series: [
            {
                name: "",
                data: []
            }
        ]
    });

    useEffect(() => {
        setIsLoading(true);
        axios.get(`${BASE_URL}/sales/success-by-seller`)
            .then(response => {
                const data = response.data as SaleSuccess[];
                const myLabels = data.map(x => x.sellerName);
                const mySeries = data.map(x => round(x.deals / x.visited * 100, 1));

                setChartData({
                    labels: {
                        categories: myLabels
                    },
                    series: [
                        {
                            name: "% Sucesso",
                            data: mySeries
                        }
                    ]
                });
            })
            .finally(() => {
                setIsLoading(false);
            });
    }, []);

    const options = {
        plotOptions: {
            bar: {
                horizontal: true,
            }
        },
    };

    return (
        <>
            {isLoading ? <BarChartLoader /> : <Chart
                options={{ ...options, xaxis: chartData.labels }}
                series={chartData.series}
                type="bar"
                height="240"
            />}
        </>
    );
}

export default BarChart;
