import { defineStore } from "pinia"
import axios from 'axios'

export const useEmployeeStore = defineStore('employee', {
  state: () => ({
    selectedEmployee: {
      em_userid: '',
      em_name: '',
      em_password: '',
      em_phone: '',
      em_birth: '',
      em_address: '',
      em_location: '',
      em_pics: '',
      dept_name: '',
      dept_no: 0,
      em_gender: '',
      em_position: '',
      ranknum: 0
    },
    rank: [],
    updatedData: [],
    empResult: [],
  }),
  actions: {
    selectEmployee(data) {
      this.selectedEmployee = { ...this.selectedEmployee, ...data }
    },

    async resetData() {
      this.selectedEmployee = {
        em_userid: '',
        em_name: '',
        em_password: '',
        em_phone: '',
        em_birth: '',
        em_address: '',
        em_location: '',
        em_pics: '',
        dept_name: '',
        dept_no: 0,
        em_gender: '',
        em_position: '',
        ranknum: 0
      }
    },

    async getEmpInfo() {
      try {
        const response = await axios.get('http://localhost:8085/employeeList')
        this.empResult = response.data
      } catch (error) {
        console.log(error.response.data)
      }
    },

    async deleteEmp() {
      const Checkeduserid = this.empResult.filter(row => row.isChecked).map(row => row.em_userid)
      try {
        const response = await axios.delete('http://localhost:8085/delete', { data: Checkeduserid })
        this.empResult = this.empResult.filter(row => !row.isChecked)
        console.log(response)
      } catch (error) {
        console.log(error)
      }
    },

    async insertEmp() {
      try {
        const response = await axios.post('http://localhost:8085/empinsert', this.selectedEmployee)
        console.log(response)
      } catch (error) {
        console.log(error)
      }
    },

    async rankDeptStore() {
      try {
        const response = await axios.get('http://localhost:8085/empinsert')
        this.rank = response.data
      } catch (error) {
        console.log(error.response.data)
      }
    },
    async updateEmp() {
      try {
        const response = await axios.patch('http://localhost:8085/employee', this.selectedEmployee)
        this.updatedData = response.data
      } catch (error) {
        console.log(error.response.data)
      }
    }
  },
  persist: true
})

export const useLoginStore = defineStore('loginStore', {
  state: () => ({
    loginData: {
      em_userid: '',
      em_password: ''
    }
  }),
  actions: {
    LoginCheck: async () => {
      const loginStore = useLoginStore()
      try {
        const response = await axios.post('http://localhost:8085', loginStore.loginData, { withCredentials: true })
        console.log(response)
      } catch(error){
        console.log(error.response.data)
      }
    }
  },

  persist: true
})