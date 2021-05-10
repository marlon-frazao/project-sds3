import React from 'react'
import ContentLoader from 'react-content-loader'

//https://skeletonreact.com/
const BarChartLoader = () => (
    <ContentLoader viewBox="0 0 400 150" speed={2} height={300} width={600} >
        <rect x="25" y="15" rx="5" ry="5" width="300" height="10" />
        <rect x="25" y="45" rx="5" ry="5" width="300" height="10" />
        <rect x="25" y="75" rx="5" ry="5" width="300" height="10" />
        <rect x="25" y="105" rx="5" ry="5" width="300" height="10" />
    </ContentLoader>
)

BarChartLoader.metadata = {
    name: 'DaniloWoz',
    github: 'danilowoz',
    description: 'Bullet list',
    filename: 'BarChartLoader',
}

export default BarChartLoader;