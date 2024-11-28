import Index from "@/pages/frontend/index.vue";
import Login from "@/pages/admin/login.vue";
import { createRouter, createWebHashHistory } from 'vue-router'

//统一在这里声明所有路由
const routes = [
    {
        path: '/',//路由地址
        component: Index,//对应组件
        meta:{ //meta信息
            title:'Weblog首页'//页面标题
        }
    },

    {
        path: '/login', //登录页
        component: Login,
        meta: {
            title: 'Weblog登录页'
        }
    }
]

//创建路由
const router = createRouter({
    //指定路由的历史管理方式，hash模式指的是URL的路径是通过hash符号（#）进行标识
    history:createWebHashHistory(),
    //routes:routes的缩写
    routes,
})

//ES6模块导出语句，它用于将router对象导出，以便其他文件可以导入和使用这个对象
export default router