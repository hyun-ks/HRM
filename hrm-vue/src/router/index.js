import { createRouter, createWebHistory } from 'vue-router'

const routes = [
    {
        path: '/',
        name: 'Login',
        component: () => import('../views/LoginView.vue')
    },

    {
      path: '/main',
      name: 'Main',
      component: () => import('../views/MainView.vue'),
    },
    {
      path: '/employee',
      name: 'Employee',
      component: () => import('../views/EmployeeView.vue'),
    },
    {
      path: '/approval',
      name: 'Approval',
      component: () => import('../views/ApprovalView.vue'),

    }
  ];


  const router = createRouter({
    history: createWebHistory(),
    routes,
  });
  
  export default router;