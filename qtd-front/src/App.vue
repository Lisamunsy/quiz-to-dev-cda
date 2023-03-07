<script setup>
import { RouterLink, RouterView } from 'vue-router'
import Navbar from './components/shared/Navbar.vue'
</script>

<template>
<header>

  <Navbar/>
</header>

  <RouterView />
</template>

<style scoped>

</style>
