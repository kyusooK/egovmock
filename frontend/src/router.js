
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import OrderOrderManager from "./components/listers/OrderOrderCards"
import OrderOrderDetail from "./components/listers/OrderOrderDetail"

import DeliveryDeliveryManager from "./components/listers/DeliveryDeliveryCards"
import DeliveryDeliveryDetail from "./components/listers/DeliveryDeliveryDetail"
import DeliveryTestAggManager from "./components/listers/DeliveryTestAggCards"
import DeliveryTestAggDetail from "./components/listers/DeliveryTestAggDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/orders/orders',
                name: 'OrderOrderManager',
                component: OrderOrderManager
            },
            {
                path: '/orders/orders/:id',
                name: 'OrderOrderDetail',
                component: OrderOrderDetail
            },

            {
                path: '/deliveries/deliveries',
                name: 'DeliveryDeliveryManager',
                component: DeliveryDeliveryManager
            },
            {
                path: '/deliveries/deliveries/:id',
                name: 'DeliveryDeliveryDetail',
                component: DeliveryDeliveryDetail
            },
            {
                path: '/deliveries/testAggs',
                name: 'DeliveryTestAggManager',
                component: DeliveryTestAggManager
            },
            {
                path: '/deliveries/testAggs/:id',
                name: 'DeliveryTestAggDetail',
                component: DeliveryTestAggDetail
            },



    ]
})
