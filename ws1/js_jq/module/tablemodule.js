/*
     An ES6 module exporting a Table class
     This is ECMA-script 6 (ES6 or ES2015)

     This uses JQuery for DOM maipulation
*/
export class Table {

  constructor(rows, cols, data, striped) {
    this.rows = rows;
    this.cols = cols;
    this.data = data;
    this.striped = striped;
  }

  render() {
    let tbl = document.createElement('table');
    let tbdy = document.createElement('tbody');
    let tr = document.createElement('tr');
    let elems = this.data;
    let cols = this.cols;
    let rows = this.rows;
    let striped = this.striped;
    let noElems = Array.from(Array(this.rows*this.cols).keys());
    noElems.forEach(function(element) {
      let td = document.createElement('td');
      if(((element%(cols*2)) < cols ) && striped){
        td.style.background = "lightgrey";
      }
      td.innerHTML= elems[element];
      tr.appendChild(td);
      console.log(element + " : " + cols + " : " + (element%cols));
      if(element%cols == cols-1) {
        tbdy.appendChild(tr);
        tr = document.createElement('tr');
      }
    });
    // TODO
    tbl.appendChild(tbdy);
    console.log(tbdy);
    return tbl;
  }

  edit(row, col, value) {
    console.log(this.data);
    this.data[row * this.cols + col] = value;
    console.log(this.data[row * this.cols + col]);
  }

}
