import { defineStore } from "pinia"

export const useEmployeeStore = defineStore('employee',{
    state: () => ({
        selectedEmployee:{
        em_userid: '',
        em_name: '',
        em_password: '',
        em_phone: '',
        em_birth: ''
        }
    }),
    actions: {
        selectEmployee(data){
            this.selectedEmployee = {...this.selectedEmployee, ...data}
        }
    },
    persist: true
})