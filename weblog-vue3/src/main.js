import '@/assets/main.css' //引入main.css样式文件
import 'animate.css';

import { createApp } from 'vue' //引入creatApp方法
import App from '@/app.vue' //引入App.vue组件

//导入路由
import router from '@/router'

//导入 Element Plus 图标
import * as ElementPlusIconsVue from '@element-plus/icons-vue'

//创建应用，并将App根组件挂载到<div id="#app"></div>中
// createApp(App).mount('#app')

const app = createApp(App)

for (const [key,component] of Object.entries(ElementPlusIconsVue)) {
    app.component(key, component)
}
//应用路由
app.use(router)
app.mount('#app')