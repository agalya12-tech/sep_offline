import { useState } from "react"

const useFetchData = (url) => {
    let [data, setData] = useState(null);
    fetch(url)
    .then(response => response.json())
    .then(data => setData(data));
    return data;
}
export default useFetchData;