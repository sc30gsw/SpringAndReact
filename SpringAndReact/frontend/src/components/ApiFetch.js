import React, {useState, useEffect} from 'react'

const ApiFetch = () => {

    const [posts, setPosts] = useState([])

    useEffect(() => {
        fetch('http://localhost:8080/api/hello', {method: 'GET'})
        .then(res => res.json())
        .then(data => {
            setPosts(data)
        })
    },[])

    return (
        <div>
            <ul>
				<li>{posts.month}</li>
				<li>{posts.color}</li>
				<li>{posts.name}</li>
            </ul>
        </div>
    )
}

export default ApiFetch