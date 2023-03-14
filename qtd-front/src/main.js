import { createApp } from 'vue'
import { createPinia } from 'pinia'
import axiosConfig from './plugins/axiosConfig'

import App from './App.vue'
import router from './router'

import './assets/main.css'

const app = createApp(App)

app.use(createPinia())

app.use(axiosConfig);

app.use(router)

app.mount('#app')
