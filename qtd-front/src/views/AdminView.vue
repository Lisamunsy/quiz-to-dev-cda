<script>

</script>

<template>
    <div class="bg-warning pt-5 mt-3 fixed-top z-1">
        <div class="container row">
            <div class="col border-warning text-black text-center">
                <router-link to="/topics" class="nav-link">Topics list</router-link>
            </div>
            <div class="col border-warning text-black text-center">
                <router-link to="/create-topic" class="nav-link">Create-topic</router-link>
            </div>
            <div class="col border-warning text-black text-center"><h5 class="nav-link">Test</h5></div>
        </div>
    </div>
    <main class="pt-5 mt-5">
        <RouterView/>
    </main>
</template>