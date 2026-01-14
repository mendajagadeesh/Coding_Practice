const EventEmitter =require('events');
class pizzashop extends EventEmitter{
    constructor(){
        super();
        this.orderNumber=0;
    }
    order(size,topping){
        this.orderNumber++;
        this.emit("order",size,topping);
    }

    displayorderNumber(){
        console.log(`the current order number${this.orderNumber}`);
    }
}
module.exports=pizzashop;