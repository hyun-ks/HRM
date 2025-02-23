<template>
    <div>
        <!--start Side bar-->
        <div class="fixed left-0 top-0 w-64 h-full bg-gray-800 p-4">
            <a href="#" class="flex items-center pb-4 border-b border-b-gray-600">
                <img src="https://placehold.co/32*32" alt="" class="w-8 h-8 rounded object-cover">
                <span class="text-lg font-bold text-white ml-3">Logo</span>
            </a>

            <ul class="mt-4">
                <li class="mb-1">
                    <router-link to="Main" class="flex items-center py-2 px-4 hover:bg-gray-400 rounded-md">
                        <svg xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke-width="1.5"
                            stroke="white" class="size-6">
                            <path stroke-linecap="round" stroke-linejoin="round"
                                d="m2.25 12 8.954-8.955c.44-.439 1.152-.439 1.591 0L21.75 12M4.5 9.75v10.125c0 .621.504 1.125 1.125 1.125H9.75v-4.875c0-.621.504-1.125 1.125-1.125h2.25c.621 0 1.125.504 1.125 1.125V21h4.125c.621 0 1.125-.504 1.125-1.125V9.75M8.25 21h8.25" />
                        </svg>
                        <span class="text-sm font-bold text-white ml-3">Home</span>

                    </router-link>
                </li>

                <li class="mb-1">
                    <a @click="toggleDropdown"
                        class="flex items-center py-2 px-4 hover:bg-gray-400 rounded-md cursor-pointer">
                        <svg xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke-width="1.5"
                            stroke="white" class="size-6">
                            <path stroke-linecap="round" stroke-linejoin="round"
                                d="M15 19.128a9.38 9.38 0 0 0 2.625.372 9.337 9.337 0 0 0 4.121-.952 4.125 4.125 0 0 0-7.533-2.493M15 19.128v-.003c0-1.113-.285-2.16-.786-3.07M15 19.128v.106A12.318 12.318 0 0 1 8.624 21c-2.331 0-4.512-.645-6.374-1.766l-.001-.109a6.375 6.375 0 0 1 11.964-3.07M12 6.375a3.375 3.375 0 1 1-6.75 0 3.375 3.375 0 0 1 6.75 0Zm8.25 2.25a2.625 2.625 0 1 1-5.25 0 2.625 2.625 0 0 1 5.25 0Z" />
                        </svg>
                        <span class="text-sm font-bold text-white ml-3">Employee</span>
                        <svg xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke-width="1.5"
                            stroke="white" class="size-4 ml-auto" :class="{ 'rotate-90': isOpen }">
                            <path stroke-linecap="round" stroke-linejoin="round" d="m8.25 4.5 7.5 7.5-7.5 7.5" />
                        </svg>
                    </a>
                    <ul class="pl-7 mt-2" :class="{ 'hidden': !isOpen }">
                        <li class="mb-3">
                            <a href="#"
                                class="text-gray-300 text-sm flex items-center hover:text-white before:contents-[''] before:w-1 before:h-1 before:rounded-full before:bg-gray-300 before:mr-3">Attendance</a>
                        </li>
                        <li class="mb-3">
                            <router-link to="EmployeeList"
                                class="text-gray-300 text-sm flex items-center hover:text-white before:contents-[''] before:w-1 before:h-1 before:rounded-full before:bg-gray-300 before:mr-3">Member</router-link>
                        </li>
                        <li class="mb-3">
                            <router-link to="Empinsert"
                                class="text-gray-300 text-sm flex items-center hover:text-white before:contents-[''] before:w-1 before:h-1 before:rounded-full before:bg-gray-300 before:mr-3">Employee
                                Insert</router-link>
                        </li>
                    </ul>
                </li>

                <li class="mb-1">
                    <a href="#" class="flex items-center py-2 px-4 hover:bg-gray-400 rounded-md">
                        <svg xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke-width="1.5"
                            stroke="white" class="size-6">
                            <path stroke-linecap="round" stroke-linejoin="round"
                                d="M6.75 2.994v2.25m10.5-2.25v2.25m-14.252 13.5V7.491a2.25 2.25 0 0 1 2.25-2.25h13.5a2.25 2.25 0 0 1 2.25 2.25v11.251m-18 0a2.25 2.25 0 0 0 2.25 2.25h13.5a2.25 2.25 0 0 0 2.25-2.25m-18 0v-7.5a2.25 2.25 0 0 1 2.25-2.25h13.5a2.25 2.25 0 0 1 2.25 2.25v7.5m-6.75-6h2.25m-9 2.25h4.5m.002-2.25h.005v.006H12v-.006Zm-.001 4.5h.006v.006h-.006v-.005Zm-2.25.001h.005v.006H9.75v-.006Zm-2.25 0h.005v.005h-.006v-.005Zm6.75-2.247h.005v.005h-.005v-.005Zm0 2.247h.006v.006h-.006v-.006Zm2.25-2.248h.006V15H16.5v-.005Z" />
                        </svg>
                        <span class="text-sm font-bold text-white ml-3">Schedule</span>
                    </a>
                </li>

                <li class="mb-1">
                    <a href="#" class="flex items-center py-2 px-4 hover:bg-gray-400 rounded-md">
                        <svg xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke-width="1.5"
                            stroke="white" class="size-6">
                            <path stroke-linecap="round" stroke-linejoin="round"
                                d="M17.982 18.725A7.488 7.488 0 0 0 12 15.75a7.488 7.488 0 0 0-5.982 2.975m11.963 0a9 9 0 1 0-11.963 0m11.963 0A8.966 8.966 0 0 1 12 21a8.966 8.966 0 0 1-5.982-2.275M15 9.75a3 3 0 1 1-6 0 3 3 0 0 1 6 0Z" />
                        </svg>

                        <span class="text-sm font-bold text-white ml-3">Profile</span>
                    </a>
                </li>

                <li class="mb-1">
                    <a href="#" class="flex items-center py-2 px-4 hover:bg-gray-400 rounded-md">
                        <svg xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke-width="1.5"
                            stroke="white" class="size-6">
                            <path stroke-linecap="round" stroke-linejoin="round"
                                d="M9.594 3.94c.09-.542.56-.94 1.11-.94h2.593c.55 0 1.02.398 1.11.94l.213 1.281c.063.374.313.686.645.87.074.04.147.083.22.127.325.196.72.257 1.075.124l1.217-.456a1.125 1.125 0 0 1 1.37.49l1.296 2.247a1.125 1.125 0 0 1-.26 1.431l-1.003.827c-.293.241-.438.613-.43.992a7.723 7.723 0 0 1 0 .255c-.008.378.137.75.43.991l1.004.827c.424.35.534.955.26 1.43l-1.298 2.247a1.125 1.125 0 0 1-1.369.491l-1.217-.456c-.355-.133-.75-.072-1.076.124a6.47 6.47 0 0 1-.22.128c-.331.183-.581.495-.644.869l-.213 1.281c-.09.543-.56.94-1.11.94h-2.594c-.55 0-1.019-.398-1.11-.94l-.213-1.281c-.062-.374-.312-.686-.644-.87a6.52 6.52 0 0 1-.22-.127c-.325-.196-.72-.257-1.076-.124l-1.217.456a1.125 1.125 0 0 1-1.369-.49l-1.297-2.247a1.125 1.125 0 0 1 .26-1.431l1.004-.827c.292-.24.437-.613.43-.991a6.932 6.932 0 0 1 0-.255c.007-.38-.138-.751-.43-.992l-1.004-.827a1.125 1.125 0 0 1-.26-1.43l1.297-2.247a1.125 1.125 0 0 1 1.37-.491l1.216.456c.356.133.751.072 1.076-.124.072-.044.146-.086.22-.128.332-.183.582-.495.644-.869l.214-1.28Z" />
                            <path stroke-linecap="round" stroke-linejoin="round"
                                d="M15 12a3 3 0 1 1-6 0 3 3 0 0 1 6 0Z" />
                        </svg>

                        <span class="text-sm font-bold text-white ml-3">Settings</span>
                    </a>
                </li>
            </ul>
        </div>
        <!--end Side bar-->
        <main class="w-[calc(100%-256px)] ml-64 bg-gray-50 min-h-screen"><!--뷰포트의 높이만큼 채우기-->
            <div class="py-2 px-6 bg-white flex items-center shadow-md shadow-black/5">
                <button type="button" class="text-gray-600 text-lg">
                    <svg xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke-width="1.5"
                        stroke="currentColor" class="size-6">
                        <path stroke-linecap="round" stroke-linejoin="round"
                            d="M3.75 6.75h16.5M3.75 12h16.5m-16.5 5.25h16.5" />
                    </svg>
                </button>
                <ul class="flex items-center text-sm font-bold ml-4">
                    <li class="mr-2">
                        <a href="#" class=" text-gray-400 hover:text-gray-600">Dashboard</a>
                    </li>
                    <li class="text-gray-600 mr-2">/</li>
                    <li class="text-gray-600 mr-2">Employee</li>
                </ul>
                <ul class="ml-auto flex items-center">
                    <li class="mr-2">
                        <button type="button"
                            class="text-gray-400 w-8 h-8 rounded flex items-center justify-center hover:bg-gray-50 hover:text-gray-600"><!--버튼클릭유무 확인활성화-->
                            <svg xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke-width="1.5"
                                stroke="currentColor" class="size-5">
                                <path stroke-linecap="round" stroke-linejoin="round"
                                    d="m21 21-5.197-5.197m0 0A7.5 7.5 0 1 0 5.196 5.196a7.5 7.5 0 0 0 10.607 10.607Z" />
                            </svg>
                        </button>
                    </li>
                    <li>
                        <button type="button"
                            class="text-gray-400 w-8 h-8 rounded flex items-center justify-center hover:bg-gray-50 hover:text-gray-600">
                            <svg xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke-width="1.5"
                                stroke="currentColor" class="size-5">
                                <path stroke-linecap="round" stroke-linejoin="round"
                                    d="M14.857 17.082a23.848 23.848 0 0 0 5.454-1.31A8.967 8.967 0 0 1 18 9.75V9A6 6 0 0 0 6 9v.75a8.967 8.967 0 0 1-2.312 6.022c1.733.64 3.56 1.085 5.455 1.31m5.714 0a24.255 24.255 0 0 1-5.714 0m5.714 0a3 3 0 1 1-5.714 0" />
                            </svg>
                        </button>
                    </li>
                </ul>
            </div>

            <!--employee table start-->
            <div class="p-6">
                <div class="grid grid-cols-1">
                    <div class="bg-white border border-gray-100 shadow-md shadow-black/10 p-6 rounded-md">
                        <div class="text-center flex justify-end">
                            <button type="button"
                                class="bg-gray-500 text-white font-semibold py-1 px-3 rounded-lg shadow-md hover:bg-gray-400 hover:text-black transition duration-200 ease-in-out"
                                @click="deleteRow">
                                delete
                            </button>
                        </div>
                        <div class="overflow-auto">
                            <table class="w-full">
                                <thead>
                                    <tr>
                                        <th class=" text-white py-2 px-4 bg-gray-500 rounded-tl-md rounded-bl-md">
                                            <div class="flex items-center justify-center">
                                            </div>
                                        </th>
                                        <th
                                            class="text-[12px] uppercase tracking-wide font-medium text-white py-2 px-4 bg-gray-500">
                                            <div class="flex items-center justify-center">pic</div>
                                        </th>
                                        <th
                                            class="text-[12px] uppercase tracking-wide font-medium text-white py-2 px-4 bg-gray-500">
                                            <div class="flex items-center justify-center">em_name</div>
                                        </th>
                                        <th
                                            class="text-[12px] uppercase tracking-wide font-medium text-white py-2 px-4 bg-gray-500">
                                            <div class="flex items-center justify-center">dept</div>
                                        </th>
                                        <th
                                            class="text-[12px] uppercase tracking-wide font-medium text-white py-2 px-4 bg-gray-500">
                                            <div class="flex items-center justify-center">position</div>
                                        </th>
                                        <th
                                            class="text-[12px] uppercase tracking-wide font-medium text-white py-2 px-4 bg-gray-500">
                                            <div class="flex items-center justify-center">birth</div>
                                        </th>
                                        <th
                                            class="text-[12px] uppercase tracking-wide font-medium text-white py-2 px-4 bg-gray-500">
                                            <div class="flex items-center justify-center">gender</div>
                                        </th>
                                        <th
                                            class="text-[12px] uppercase tracking-wide font-medium text-white py-2 px-4 bg-gray-500">
                                            <div class="flex items-center justify-center">phone</div>
                                        </th>
                                        <th
                                            class="text-[12px] uppercase tracking-wide font-medium text-white py-2 px-4 bg-gray-500">
                                            <div class="flex items-center justify-center">address</div>
                                        </th>
                                        <th
                                            class="text-[12px] uppercase tracking-wide font-medium text-white py-2 px-4 bg-gray-500">
                                            <div class="flex items-center justify-center">detail_address</div>
                                        </th>
                                        <th
                                            class="text-[12px] uppercase tracking-wide font-medium text-white py-2 px-4 bg-gray-500 rounded-tr-md rounded-br-md">
                                            <div class="flex items-center justify-center"></div>
                                        </th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr v-for="(row, index) in result" v-bind:key="row.em_userid"
                                        v-bind:class="{ 'bg-gray-100': index % 2 === 0 }">
                                        <td class="py-2 px-4 border-b border-b-gray-100">
                                            <div class="flex items-center justify-center">
                                                <input type="checkbox"
                                                    class="form-checkbox h-4 w-4 text-black transition duration-150 ease-in-out"
                                                    v-model="row.isChecked"/>
                                            </div>
                                        </td>
                                        <td class="py-2 px-4 border-b border-b-gray-100">
                                            <div class="flex items-center justify-center">
                                                <img :src="row.em_pics" alt=""
                                                    class="w-10 h-10 rounded-full object-cover">
                                            </div>
                                        </td>
                                        <td class="py-2 px-4 border-b border-b-gray-100">
                                            <span
                                                class="flex items-center justify-center text-sm font-bold text-black">{{
                                                row.em_name }}</span>
                                        </td>
                                        <td class="py-2 px-4 border-b border-b-gray-100">
                                            <span
                                                class="flex items-center justify-center text-sm font-bold text-black">{{
                                                row.dept_name }}</span>
                                        </td>
                                        <td class="py-2 px-4 border-b border-b-gray-100">
                                            <span
                                                class="flex items-center justify-center text-sm font-bold text-black">{{
                                                row.em_position }}</span>
                                        </td>
                                        <td class="py-2 px-4 border-b border-b-gray-100">
                                            <span
                                                class="flex items-center justify-center text-sm font-bold text-black">{{
                                                row.em_birth }}</span>
                                        </td>
                                        <td class="py-2 px-4 border-b border-b-gray-100">
                                            <span
                                                class="flex items-center justify-center text-sm font-bold text-black">{{
                                                row.em_gender }}</span>
                                        </td>
                                        <td class="py-2 px-4 border-b border-b-gray-100">
                                            <span
                                                class="flex items-center justify-center text-sm font-bold text-black">{{
                                                row.em_phone }}</span>
                                        </td>
                                        <td class="py-2 px-4 border-b border-b-gray-100">
                                            <span
                                                class="flex items-center justify-center text-[13px] font-bold text-black">{{
                                                row.em_address }}</span>
                                        </td>
                                        <td class="py-2 px-4 border-b border-b-gray-100">
                                            <span
                                                class="flex items-center justify-center text-[13px] font-bold text-black">{{
                                                row.em_location }}</span>
                                        </td>
                                        <td>
                                            <svg xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24"
                                                stroke-width="1" stroke="currentColor" class="size-4 cursor-pointer" @click="modify(index)">
                                                <path stroke-linecap="round" stroke-linejoin="round"
                                                    d="m16.862 4.487 1.687-1.688a1.875 1.875 0 1 1 2.652 2.652L6.832 19.82a4.5 4.5 0 0 1-1.897 1.13l-2.685.8.8-2.685a4.5 4.5 0 0 1 1.13-1.897L16.863 4.487Zm0 0L19.5 7.125" />
                                            </svg>
                                        </td>

                                    </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
            <!--employee table end-->
        </main>
    </div>
</template>

<script>
import axios from 'axios'

export default {
    name: 'EmployeeList',
    data() {
        return {
            isOpen: false,
            result: [],
            row : {
                isChecked: false
            }
        }
    },
    created() {
        this.getData()
    },
    methods: {
        getData() {
            axios
                .get('http://localhost:8085/employeeList')
                .then((response) => {
                    console.log(response)
                    this.result = response.data
                })
                .catch((error) => {
                    console.log(error)
                })
        },
        deleteRow() {
            const Checkeduserid = this.result.filter(row => row.isChecked).map(row => row.em_userid)
                axios.delete('http://localhost:8085/delete', {data: Checkeduserid})
                    .then((response) => {
                        this.result = this.result.filter(row => !row.isChecked)
                        console.log(this.result)
                        console.log(response)
                    })
                    .catch((error) => {
                        console.log(error.response.data)
                    })
            },
            toggleDropdown(){
                this.isOpen = !this.isOpen
            },
            modify(index){
                const selectedRow = this.result[index]
                console.log(selectedRow)
                console.log(selectedRow.em_userid)
                this.$router.push({name: 'Employee'})
            }
        }
    }
</script>
