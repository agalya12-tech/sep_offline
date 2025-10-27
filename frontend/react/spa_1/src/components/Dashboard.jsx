import React from 'react'
import { Link } from 'react-router-dom'

const Dashboard = () => {
    return (
        <>
            <nav className="navbar navbar-expand-lg bg-body-tertiary" style={{ backgroundColor: " #e3f2fd;" }} data-bs-theme="light">
                <div class="container-fluid">
                    <div class="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                            <li class="nav-item">
                                <a class="nav-link active" aria-current="page" href="#">Welcome To My Application</a>
                            </li>
                            <li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                    Fetch
                                </a>
                                <ul class="dropdown-menu">
                                    <li><Link className='dropdown-item' to={'/dashboard/users'}>Users</Link></li>
                                    <li><a class="dropdown-item" href="#">Products</a></li>
                                </ul>
                            </li>

                        </ul>
                        <form class="d-flex" role="search">
                            <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search" />
                            <button class="btn btn-outline-success" type="submit">Search</button>
                        </form>
                    </div>
                </div>



            </nav>
        </>
    )
}

export default Dashboard