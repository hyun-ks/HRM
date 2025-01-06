import { defineConfig } from 'vite'
import vue from '@vitejs/plugin-vue'
import path from 'path'

export default defineConfig({
  plugins: [vue()],
  define: {
    'process.env': {
      BASE_IMAGE_PATH: JSON.stringify('C:\ProgramData\MySQL\MySQL Server 8.0\Uploads/')
    }
  }
})