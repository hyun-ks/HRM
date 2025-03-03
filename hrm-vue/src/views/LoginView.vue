<template>
    <section class="bg-gray-50 min-h-screen flex items-center justify-center">
        <div class="bg-gray-100 flex rounded-2xl shadow-lg w-3/4 p-5">
            <!--login-->
            <div class="sm:w-1/2">
                <h2 class="font-bold text-2xl flex justify-center mr-2 mt-5">
                    <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" fill="currentColor" class="size-6 mt-2">
                        <path fill-rule="evenodd"
                            d="M7.5 6a4.5 4.5 0 1 1 9 0 4.5 4.5 0 0 1-9 0ZM3.751 20.105a8.25 8.25 0 0 1 16.498 0 .75.75 0 0 1-.437.695A18.683 18.683 0 0 1 12 22.5c-2.786 0-5.433-.608-7.812-1.7a.75.75 0 0 1-.437-.695Z"
                            clip-rule="evenodd" />
                    </svg>
                    Login
                </h2>

                <form class="flex flex-col gap-4 mt-4 items-center">
                    <input type="text" id="em_userid" placeholder="userid" class="w-1/2 p-2 mt-8 rounded-xl border"
                        v-model="LoginStore.loginData.em_userid">
                    <input type="password" id="em_password" placeholder="password" class="w-1/2 p-2 rounded-xl border"
                        v-model="LoginStore.loginData.em_password">
                    <button type="button" @click="Login"
                        class="bg-gray-800 rounded-xl text-white py-2 w-1/2">Login</button>
                </form>

                <div class="mt-5 w-1/2 grid grid-cols-3 items-center text-gray-500 mx-auto">
                    <hr class="border-gray-500">
                    <p class="text-center">OR</p>
                    <hr class="border-gray-500">
                </div>

                <button class="bg-white border py-2 w-1/2 rounded-xl mt-3 flex justify-center items-center mx-auto"><svg
                        xmlns="http://www.w3.org/2000/svg" x="0px" y="0px" width="25" height="25" viewBox="0 0 48 48"
                        class="mr-3">
                        <path fill="#FFC107"
                            d="M43.611,20.083H42V20H24v8h11.303c-1.649,4.657-6.08,8-11.303,8c-6.627,0-12-5.373-12-12c0-6.627,5.373-12,12-12c3.059,0,5.842,1.154,7.961,3.039l5.657-5.657C34.046,6.053,29.268,4,24,4C12.955,4,4,12.955,4,24c0,11.045,8.955,20,20,20c11.045,0,20-8.955,20-20C44,22.659,43.862,21.35,43.611,20.083z">
                        </path>
                        <path fill="#FF3D00"
                            d="M6.306,14.691l6.571,4.819C14.655,15.108,18.961,12,24,12c3.059,0,5.842,1.154,7.961,3.039l5.657-5.657C34.046,6.053,29.268,4,24,4C16.318,4,9.656,8.337,6.306,14.691z">
                        </path>
                        <path fill="#4CAF50"
                            d="M24,44c5.166,0,9.86-1.977,13.409-5.192l-6.19-5.238C29.211,35.091,26.715,36,24,36c-5.202,0-9.619-3.317-11.283-7.946l-6.522,5.025C9.505,39.556,16.227,44,24,44z">
                        </path>
                        <path fill="#1976D2"
                            d="M43.611,20.083H42V20H24v8h11.303c-0.792,2.237-2.231,4.166-4.087,5.571c0.001-0.001,0.002-0.001,0.003-0.002l6.19,5.238C36.971,39.205,44,34,44,24C44,22.659,43.862,21.35,43.611,20.083z">
                        </path>
                    </svg>Login with Google</button>

                <p class="w-1/2 text-xs border-b py-6 border-gray-500 mx-auto">Forgot your password?</p>

                <div class="text-sm w-1/2 flex justify-between items-center mx-auto">
                    <p>don't have your account?</p>
                    <button
                        class="py-2 px-5 bg-white border rounded-xl mt-2 hover:bg-gray-500 hover:text-white">Register</button>
                </div>



            </div>

            <!--image-->
            <div class="w-1/2 p-5 sm:block hidden">
                <img src="../assets/images/login.jpg" alt="로그인화면" class="rounded-2xl">
            </div>
        </div>
    </section>
</template>

<script>
import { useRouter } from 'vue-router'
import { onMounted } from 'vue'
import { useEmployeeStore } from '../store/emp'
import { useLoginStore } from '../store/emp'


export default {
    name: 'Login',
    setup() {
        const employeeStore = useEmployeeStore()
        const LoginStore = useLoginStore()
        const router = useRouter()

        onMounted(() => {
            console.log(employeeStore.empResult)
            console.log(LoginStore.loginData)
        })


        const Login = async () => {
            try {
                await LoginStore.LoginCheck()

                if (employeeStore.empResult.some(item => item.em_userid === LoginStore.loginData.em_userid) &&
                    employeeStore.empResult.some(item => item.em_password === LoginStore.loginData.em_password)) {
                    router.push({ name: 'EmployeeList' })
                }
                else {
                    alert('아이디혹은 비밀번호가 틀렸습니다')
                }
            } catch (error) {
                console.log(error)
            }

        }

        return {
            employeeStore,
            LoginStore,
            router,
            Login,
            onMounted
        }

    }
}
















</script>