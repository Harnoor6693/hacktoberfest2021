//export {Room}; //method 1 of exporting class
//class User{} //it is possible to have multiple classes in same file(but not recommended)
export class Room{ //method 2 of exporting class
    //private id:number;
    name:string;

    //method to write constructor
    //if we don't pass value while creating object hten default vaule will be assigned
    constructor(private id:number=0){ //we can declare in constructor as well
        //this.id = id;
    }

    getId():number{
        //return id; //we have to write this.
        return this.id;
    }

}