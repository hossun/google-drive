
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import DriverManager from "./components/listers/DriverCards"
import DriverDetail from "./components/listers/DriverDetail"

import IndexManager from "./components/listers/IndexCards"
import IndexDetail from "./components/listers/IndexDetail"

import VideoManager from "./components/listers/VideoCards"
import VideoDetail from "./components/listers/VideoDetail"

import NofificationManager from "./components/listers/NofificationCards"
import NofificationDetail from "./components/listers/NofificationDetail"


import DashboardView from "./components/DashboardView"
import DashboardViewDetail from "./components/DashboardViewDetail"

export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/drivers',
                name: 'DriverManager',
                component: DriverManager
            },
            {
                path: '/drivers/:id',
                name: 'DriverDetail',
                component: DriverDetail
            },

            {
                path: '/indices',
                name: 'IndexManager',
                component: IndexManager
            },
            {
                path: '/indices/:id',
                name: 'IndexDetail',
                component: IndexDetail
            },

            {
                path: '/videos',
                name: 'VideoManager',
                component: VideoManager
            },
            {
                path: '/videos/:id',
                name: 'VideoDetail',
                component: VideoDetail
            },

            {
                path: '/nofifications',
                name: 'NofificationManager',
                component: NofificationManager
            },
            {
                path: '/nofifications/:id',
                name: 'NofificationDetail',
                component: NofificationDetail
            },


            {
                path: '/dashboards',
                name: 'DashboardView',
                component: DashboardView
            },
            {
                path: '/dashboards/:id',
                name: 'DashboardViewDetail',
                component: DashboardViewDetail
            },


    ]
})
