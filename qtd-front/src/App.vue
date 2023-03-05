<script setup>
import { RouterLink, RouterView } from 'vue-router'
import Navbar from './components/shared/Navbar.vue'
</script>

<template>
 <!-- <header>
    <div class="wrapper bg-success">

       <nav class="navbar navbar-lg  container">
        <RouterLink to="/">Home</RouterLink>
        <RouterLink to="/about">About</RouterLink>
      </nav> 
    </div>
  </header>-->
  <Navbar/>

  <RouterView />
</template>

<style scoped>

</style>
