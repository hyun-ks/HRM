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
                <a href="#" class="flex items-center py-2 px-4 hover:bg-gray-400 rounded-md">
                    <svg xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke-width="1.5" stroke="white" class="size-6">
                        <path stroke-linecap="round" stroke-linejoin="round" d="m2.25 12 8.954-8.955c.44-.439 1.152-.439 1.591 0L21.75 12M4.5 9.75v10.125c0 .621.504 1.125 1.125 1.125H9.75v-4.875c0-.621.504-1.125 1.125-1.125h2.25c.621 0 1.125.504 1.125 1.125V21h4.125c.621 0 1.125-.504 1.125-1.125V9.75M8.25 21h8.25" />
                    </svg>
                    <span class="text-sm font-bold text-white ml-3">Home</span>
                      
                </a>
            </li>

            <li class="mb-1">
                <a href="#" class="flex items-center py-2 px-4 hover:bg-gray-400 rounded-md">
                    <svg xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke-width="1.5" stroke="white" class="size-6">
                        <path stroke-linecap="round" stroke-linejoin="round" d="M15 19.128a9.38 9.38 0 0 0 2.625.372 9.337 9.337 0 0 0 4.121-.952 4.125 4.125 0 0 0-7.533-2.493M15 19.128v-.003c0-1.113-.285-2.16-.786-3.07M15 19.128v.106A12.318 12.318 0 0 1 8.624 21c-2.331 0-4.512-.645-6.374-1.766l-.001-.109a6.375 6.375 0 0 1 11.964-3.07M12 6.375a3.375 3.375 0 1 1-6.75 0 3.375 3.375 0 0 1 6.75 0Zm8.25 2.25a2.625 2.625 0 1 1-5.25 0 2.625 2.625 0 0 1 5.25 0Z" />
                    </svg>                      
                    <span class="text-sm font-bold text-white ml-3">Employee</span>
                    <svg xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke-width="1.5" stroke="white" class="size-4 ml-auto" id="dropdown">
                        <path stroke-linecap="round" stroke-linejoin="round" d="m19.5 8.25-7.5 7.5-7.5-7.5" />
                    </svg>     
                </a>
                <ul class="pl-9 mt-2 hidden" id="hide">
                    <li class="mb-3">
                        <a href="#" class="circle">Attendance</a>
                    </li>
                    <li class="mb-3">
                        <a href="#" class="circle">Member</a>
                    </li>
                </ul>
            </li>

            <li class="mb-1">
                <a href="#" class="flex items-center py-2 px-4 hover:bg-gray-400 rounded-md">
                    <svg xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke-width="1.5" stroke="white" class="size-6">
                        <path stroke-linecap="round" stroke-linejoin="round" d="M6.75 2.994v2.25m10.5-2.25v2.25m-14.252 13.5V7.491a2.25 2.25 0 0 1 2.25-2.25h13.5a2.25 2.25 0 0 1 2.25 2.25v11.251m-18 0a2.25 2.25 0 0 0 2.25 2.25h13.5a2.25 2.25 0 0 0 2.25-2.25m-18 0v-7.5a2.25 2.25 0 0 1 2.25-2.25h13.5a2.25 2.25 0 0 1 2.25 2.25v7.5m-6.75-6h2.25m-9 2.25h4.5m.002-2.25h.005v.006H12v-.006Zm-.001 4.5h.006v.006h-.006v-.005Zm-2.25.001h.005v.006H9.75v-.006Zm-2.25 0h.005v.005h-.006v-.005Zm6.75-2.247h.005v.005h-.005v-.005Zm0 2.247h.006v.006h-.006v-.006Zm2.25-2.248h.006V15H16.5v-.005Z" />
                    </svg> 
                    <span class="text-sm font-bold text-white ml-3">Schedule</span>          
                </a>
             </li>

             <li class="mb-1">
                <a href="#" class="flex items-center py-2 px-4 hover:bg-gray-400 rounded-md">
                    <svg xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke-width="1.5" stroke="white" class="size-6">
                        <path stroke-linecap="round" stroke-linejoin="round" d="M17.982 18.725A7.488 7.488 0 0 0 12 15.75a7.488 7.488 0 0 0-5.982 2.975m11.963 0a9 9 0 1 0-11.963 0m11.963 0A8.966 8.966 0 0 1 12 21a8.966 8.966 0 0 1-5.982-2.275M15 9.75a3 3 0 1 1-6 0 3 3 0 0 1 6 0Z" />
                      </svg>
                      
                    <span class="text-sm font-bold text-white ml-3">Profile</span>          
                </a>
             </li>

             <li class="mb-1">
                <a href="#" class="flex items-center py-2 px-4 hover:bg-gray-400 rounded-md">
                    <svg xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke-width="1.5" stroke="white" class="size-6">
                        <path stroke-linecap="round" stroke-linejoin="round" d="M9.594 3.94c.09-.542.56-.94 1.11-.94h2.593c.55 0 1.02.398 1.11.94l.213 1.281c.063.374.313.686.645.87.074.04.147.083.22.127.325.196.72.257 1.075.124l1.217-.456a1.125 1.125 0 0 1 1.37.49l1.296 2.247a1.125 1.125 0 0 1-.26 1.431l-1.003.827c-.293.241-.438.613-.43.992a7.723 7.723 0 0 1 0 .255c-.008.378.137.75.43.991l1.004.827c.424.35.534.955.26 1.43l-1.298 2.247a1.125 1.125 0 0 1-1.369.491l-1.217-.456c-.355-.133-.75-.072-1.076.124a6.47 6.47 0 0 1-.22.128c-.331.183-.581.495-.644.869l-.213 1.281c-.09.543-.56.94-1.11.94h-2.594c-.55 0-1.019-.398-1.11-.94l-.213-1.281c-.062-.374-.312-.686-.644-.87a6.52 6.52 0 0 1-.22-.127c-.325-.196-.72-.257-1.076-.124l-1.217.456a1.125 1.125 0 0 1-1.369-.49l-1.297-2.247a1.125 1.125 0 0 1 .26-1.431l1.004-.827c.292-.24.437-.613.43-.991a6.932 6.932 0 0 1 0-.255c.007-.38-.138-.751-.43-.992l-1.004-.827a1.125 1.125 0 0 1-.26-1.43l1.297-2.247a1.125 1.125 0 0 1 1.37-.491l1.216.456c.356.133.751.072 1.076-.124.072-.044.146-.086.22-.128.332-.183.582-.495.644-.869l.214-1.28Z" />
                        <path stroke-linecap="round" stroke-linejoin="round" d="M15 12a3 3 0 1 1-6 0 3 3 0 0 1 6 0Z" />
                      </svg>
                      
                    <span class="text-sm font-bold text-white ml-3">Settings</span>          
                </a>
             </li>
        </ul>
    </div>
    <!--end Side bar-->

    <!--start Main-->
    <main class="w-[calc(100%-256px)] ml-64 bg-gray-50 min-h-screen"><!--뷰포트의 높이만큼 채우기-->
        <div class="py-2 px-6 bg-white flex items-center shadow-md shadow-black/5">
            <button type="button" class="text-gray-600 text-lg">
                <svg xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke-width="1.5" stroke="currentColor" class="size-6">
                <path stroke-linecap="round" stroke-linejoin="round" d="M3.75 6.75h16.5M3.75 12h16.5m-16.5 5.25h16.5" />
                </svg>  
            </button>
            <ul class="flex items-center text-sm font-bold ml-4">
                <li class="mr-2">
                    <a href="#" class=" text-gray-400 hover:text-gray-600">Dashboard</a>
                </li>
                <li class="text-gray-600 mr-2">/</li>
                <li class="text-gray-600 mr-2">Analytics</li>
            </ul>
            <ul class="ml-auto flex items-center">
                <li class="mr-2">
                    <button type="button" class="text-gray-400 w-8 h-8 rounded flex items-center justify-center hover:bg-gray-50 hover:text-gray-600"><!--버튼클릭유무 확인활성화-->
                        <svg xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke-width="1.5" stroke="currentColor" class="size-5">
                        <path stroke-linecap="round" stroke-linejoin="round" d="m21 21-5.197-5.197m0 0A7.5 7.5 0 1 0 5.196 5.196a7.5 7.5 0 0 0 10.607 10.607Z" />
                        </svg>  
                    </button>
                </li>
                <li>
                    <button type="button" class="text-gray-400 w-8 h-8 rounded flex items-center justify-center hover:bg-gray-50 hover:text-gray-600">
                        <svg xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke-width="1.5" stroke="currentColor" class="size-5">
                        <path stroke-linecap="round" stroke-linejoin="round" d="M14.857 17.082a23.848 23.848 0 0 0 5.454-1.31A8.967 8.967 0 0 1 18 9.75V9A6 6 0 0 0 6 9v.75a8.967 8.967 0 0 1-2.312 6.022c1.733.64 3.56 1.085 5.455 1.31m5.714 0a24.255 24.255 0 0 1-5.714 0m5.714 0a3 3 0 1 1-5.714 0" />
                        </svg>      
                    </button>
                </li>
            </ul>
        </div>
        <!--start 3 bars-->
        <div class="p-6">
            <div class="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-6 mb-6">
                <div class="bg-white rounded-md border border-gray-100 p-6 shadow-md shadow-black/5">
                    <div class="text-2xl font-semibold">10/50</div><!--클릭하면 출근현황 알려주는 페이지로-->
                    <div class="text-sm font-medium text-gray-400">Attending Employee</div>
                    <div class="flex items-center mt-3">
                        <div class="w-full bg-gray-100 rounded-full h-4">
                            <div class="h-full bg-blue-500 rounded-full" style="width: 60%;"></div>
                        </div>
                        <span class="text-sm font-medium text-gray-600 ml-3">60%</span>
                    </div>  
                </div>
                <div class="bg-white rounded-md border border-gray-100 p-6 shadow-md shadow-black/5">
                    <div class="text-2xl font-semibold">10/50</div><!--클릭하면 출근현황 알려주는 페이지로-->
                    <div class="text-sm font-medium text-gray-400">On vacation</div>
                    <div class="flex items-center mt-3">
                        <div class="w-full bg-gray-100 rounded-full h-4">
                            <div class="h-full bg-blue-500 rounded-full" style="width: 60%;"></div>
                        </div>
                        <span class="text-sm font-medium text-gray-600 ml-3">60%</span>
                    </div>
                </div>
                <div class="bg-white rounded-md border border-gray-100 p-6 shadow-md shadow-black/5">
                    <div class="text-2xl font-semibold">10/50</div><!--클릭하면 출근현황 알려주는 페이지로-->
                    <div class="text-sm font-medium text-gray-400">Fired</div>
                    <div class="flex items-center mt-3">
                        <div class="w-full bg-gray-100 rounded-full h-4">
                            <div class="h-full bg-blue-500 rounded-full" style="width: 60%;"></div>
                        </div>
                        <span class="text-sm font-medium text-gray-600 ml-3">60%</span>
                    </div>
                </div>
            </div>
            <!--End 3 bars-->
            <!--Recent Attending-->
            <div class="grid grid-cols-1 md:grid-cols-2 gap-6">
            <div class="bg-white border border-gray-100 shadow-md shadow-black/10 p-6 rounded-md">
                <div class="flex justify-between mb-4">
                    <div class="overflow-x-auto">
                        <table class="w-full min-w-[540px]">
                            <thead>
                                <tr>
                                    <th class="text-[12px] uppercase tracking-wide font-medium text-gray-400 py-2 px-4 bg-gray-50 rounded-tl-md rounded-bl-md">name</th>
                                    <th class="text-[12px] uppercase tracking-wide font-medium text-gray-400 py-2 px-4 bg-gray-50">rank</th>
                                    <th class="text-[12px] uppercase tracking-wide font-medium text-gray-400 py-2 px-4 bg-gray-50 rounded-tr-md rounded-br-md">status</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td class="py-2 px-4 border-b border-b-gray-100">
                                        <div class="flex items-center">
                                            <img src="https://placehold.co/40*40" alt="" class="w-10 h-10 rounded-full object-cover black">
                                            <a href="#" class="text-gray-600 text-sm font-medium ml-2">Attedning Employee</a>
                                        </div>
                                    </td>
                                    <td class="py-2 px-4 border-b border-b-gray-100">
                                        <span class="text-sm font-medium text-gray-400">Assistant Manager</span>
                                    </td>
                                    <td class="py-2 px-4 border-b border-b-gray-100">
                                        <span class="inline-block p-1 rounded bg-emerald-50 text-emerald-500">present</span>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="py-2 px-4 border-b border-b-gray-100">
                                        <div class="flex items-center">
                                            <img src="https://placehold.co/40*40" alt="" class="w-10 h-10 rounded-full object-cover black">
                                            <a href="#" class="text-gray-600 text-sm font-medium ml-2">Attedning Employee</a>
                                        </div>
                                    </td>
                                    <td class="py-2 px-4 border-b border-b-gray-100">
                                        <span class="text-sm font-medium text-gray-400">Assistant Manager</span>
                                    </td>
                                    <td class="py-2 px-4 border-b border-b-gray-100">
                                        <span class="inline-block p-1 rounded bg-emerald-50 text-emerald-500">present</span>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="py-2 px-4 border-b border-b-gray-100">
                                        <div class="flex items-center">
                                            <img src="https://placehold.co/40*40" alt="" class="w-10 h-10 rounded-full object-cover black">
                                            <a href="#" class="text-gray-600 text-sm font-medium ml-2">Attedning Employee</a>
                                        </div>
                                    </td>
                                    <td class="py-2 px-4 border-b border-b-gray-100">
                                        <span class="text-sm font-medium text-gray-400">Assistant Manager</span>
                                    </td>
                                    <td class="py-2 px-4 border-b border-b-gray-100">
                                        <span class="inline-block p-1 rounded bg-emerald-50 text-emerald-500">present</span>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="py-2 px-4 border-b border-b-gray-100">
                                        <div class="flex items-center">
                                            <img src="https://placehold.co/40*40" alt="" class="w-10 h-10 rounded-full object-cover black">
                                            <a href="#" class="text-gray-600 text-sm font-medium ml-2">Attedning Employee</a>
                                        </div>
                                    </td>
                                    <td class="py-2 px-4 border-b border-b-gray-100">
                                        <span class="text-sm font-medium text-gray-400">Assistant Manager</span>
                                    </td>
                                    <td class="py-2 px-4 border-b border-b-gray-100">
                                        <span class="inline-block p-1 rounded bg-emerald-50 text-emerald-500">present</span>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="py-2 px-4 border-b border-b-gray-100">
                                        <div class="flex items-center">
                                            <img src="https://placehold.co/40*40" alt="" class="w-10 h-10 rounded-full object-cover black">
                                            <a href="#" class="text-gray-600 text-sm font-medium ml-2">Attedning Employee</a>
                                        </div>
                                    </td>
                                    <td class="py-2 px-4 border-b border-b-gray-100">
                                        <span class="text-sm font-medium text-gray-400">Assistant Manager</span>
                                    </td>
                                    <td class="py-2 px-4 border-b border-b-gray-100">
                                        <span class="inline-block p-1 rounded bg-emerald-50 text-emerald-500">present</span>
                                    </td>
                                </tr>
                            </tbody>

                        </table>

                    </div>
                    
                </div>
            </div>
            </div>
        </div>
    </main>
    <!--end Main-->

</div>
    
</template>
