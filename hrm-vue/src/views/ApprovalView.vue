<template>
    <div>
      <img v-if="imageData" :src="'data:image/png;base64,' + imageData" alt="Employee Image" />
    </div>
  </template>
  
  <script>
  import axios from 'axios';
  
  export default {
    data() {
      return {
        imageData: null,
      };
    },
    created() {
      this.fetchImage();
    },
    methods: {
      fetchImage() {
        const userId = 'chan101'; // 실제 사용자 ID로 변경
        axios.get(`http://localhost:8085/employee/${userId}`)
          .then(response => {
            this.imageData = response.data; // Base64 문자열이 반환됨
          })
          .catch(error => {
            console.error(error);
          });
      }
    }
  }
  </script>