import { createRouter, createWebHistory } from 'vue-router'

const routes = [
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
  
      },
      {
      path: '/',
      name: 'Login',
      component: () => import('../views/LoginView.vue')
      },
      {
        path: '/empinsert',
        name: 'EmpInsert',
        component: () => import('../views/EmpInsertView.vue')
      }
  ];


  const router = createRouter({
    history: createWebHistory(),
    routes,
  });
  
  export default router;

 