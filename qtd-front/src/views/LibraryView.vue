<script setup>
import HomeLibrary from '../components/HomeLibrary.vue';
import SidebarLibrary from "../components/shared/SidebarLibrary.vue";


</script>

<template>
    <main class="pt-5">
        <div class="w-100 h-100">
            <div class="row text-white w-100 h-100 m-0">
            <SidebarLibrary/>
            <HomeLibrary class="bg-ligth text-dark m-0 p-0" />
            </div>
        </div>
    </main>
</template>

<style>
main {
    height: 100vh;
    min-height: 100vh;
    overflow-y: scroll;
}
</style>