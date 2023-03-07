<script>
</script>

<template>
    <nav class="navbar navbar-expand-lg bg-light fixed-top " style="--bs-breadcrumb-divider: '>';" aria-label="breadcrumb">
        <div class="container-lg">
            <!-- <a class="navbar-brand text-secondary"  :router-link="home"></a> -->
            <Router-link tag="a" class="navbar-brand text-secondary" to="/">QuizToDev </Router-link>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
                aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a class="nav-link" aria-current="page" href="#">Quizzes</a>
                    </li>
                    <li class="nav-item dropdown">
                        <Router-link to="/library" tag="a"  class="nav-link" type="button"  >
                            Library
                        </Router-link>           
                    </li>
                    <li class="nav-item dropdown">
                        <Router-link to="/admin" tag="a"  class="nav-link" type="button"  >
                            Admin
                        </Router-link>           
                    </li>
                </ul>
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a href="" class="nav-link">Sign In</a>
                    </li>
                    <li class="nav-item">
                        <a href="#" class="nav-link btn btn-warning fw-bold text-secondary">Log In</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
</template>