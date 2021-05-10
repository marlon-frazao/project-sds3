import React from 'react'
import ContentLoader from 'react-content-loader'

//https://skeletonreact.com/
const DonutChartLoader = () => (
    <ContentLoader viewBox="0 0 400 150" speed={2} height={300} width={700} >
        <circle cx="100" cy="60" r="60" />
        <rect x="220" y="5" rx="5" ry="5" width="70" height="10" />
        <rect x="220" y="35" rx="5" ry="5" width="70" height="10" />
        <rect x="220" y="65" rx="5" ry="5" width="70" height="10" />
        <rect x="220" y="95" rx="5" ry="5" width="70" height="10" />
    </ContentLoader>
)


export default DonutChartLoader;