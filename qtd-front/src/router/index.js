import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import AdminView from '../views/AdminView.vue'
import LibraryView from '../views/LibraryView.vue'
import HomeAdmin from "../components/HomeAdmin.vue";

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView
    },
    {
      path:'/library',
      name: 'library-home',
      component: LibraryView
    },
    {
      path: '/admin',
      // route level code-splitting
      // this generates a separate chunk (About.[hash].js) for this route
      // which is lazy-loaded when the route is visited.
      component: AdminView,
      children : [
        {
          path : "",
          name :"admin-home",
          component : HomeAdmin
        }
      ]
    }
  ]
})

export default router
