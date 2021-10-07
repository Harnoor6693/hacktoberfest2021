import {Room} from './model/Room';
var r:Room = new Room();
var someRoom = new Room(2);

console.log(r.getId());
console.log(r.name);

console.log(someRoom.getId());
console.log(someRoom.name);