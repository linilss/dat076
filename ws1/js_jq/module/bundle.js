(function e(t,n,r){function s(o,u){if(!n[o]){if(!t[o]){var a=typeof require=="function"&&require;if(!u&&a)return a(o,!0);if(i)return i(o,!0);var f=new Error("Cannot find module '"+o+"'");throw f.code="MODULE_NOT_FOUND",f}var l=n[o]={exports:{}};t[o][0].call(l.exports,function(e){var n=t[o][1][e];return s(n?n:e)},l,l.exports,e,t,n,r)}return n[o].exports}var i=typeof require=="function"&&require;for(var o=0;o<r.length;o++)s(r[o]);return s})({1:[function(require,module,exports){
"use strict";

var _createClass = function () { function defineProperties(target, props) { for (var i = 0; i < props.length; i++) { var descriptor = props[i]; descriptor.enumerable = descriptor.enumerable || false; descriptor.configurable = true; if ("value" in descriptor) descriptor.writable = true; Object.defineProperty(target, descriptor.key, descriptor); } } return function (Constructor, protoProps, staticProps) { if (protoProps) defineProperties(Constructor.prototype, protoProps); if (staticProps) defineProperties(Constructor, staticProps); return Constructor; }; }(); /*
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         This is the control part connecting the table module and the page
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     */
// ES6 module style import


var _tablemodule = require("./tablemodule.js");

function _classCallCheck(instance, Constructor) { if (!(instance instanceof Constructor)) { throw new TypeError("Cannot call a class as a function"); } }

// Function run when DOM is finished loading (= document.ready() )
// Here you shoule use the jQuery DOM API and eventhandling to
$(function () {
  // Connecting eventhandlers to elements, jQuery style
  // bind() will set "this" to the control object, if NOT, the clicked
  // button will be "this"
  $("#create").on("click", control.createTable.bind(control));
  $("#edit").on("click", control.editTable.bind(control));
});

// Dummy data
var data = "The Document Object Model (DOM) is a programming interface for" + "HTML, XML and SVG documents. It provides a structured representation of the" + " document as a tree. The DOM defines methods that allow access to the tree," + " so that they can change the document structure, style and content.";

var Control = function () {
  function Control() {
    _classCallCheck(this, Control);
  }

  _createClass(Control, [{
    key: "createTable",
    value: function createTable() {
      console.log("create table");
      $("#parent").empty();
      var rows = $("#rows").val();
      var cols = $("#cols").val();
      var striped = $("#striped").is(':checked');
      console.log(rows);
      this.table = new _tablemodule.Table(rows, cols, data.split(" "), striped);
      $("#parent").append(this.table.render());
    }
  }, {
    key: "editTable",
    value: function editTable() {

      if (this.table === null) {
        return;
      } else {
        $("#parent").empty();
        var row = parseInt($("#row").val());
        var col = parseInt($("#col").val());
        var val = $("#value").val();
        this.table.edit(row, col, val);
        $("#parent").append(this.table.render());
      }
      // TODO
    }
  }]);

  return Control;
}();
// Must be after class declaration (i.e. not hoisted)


var control = new Control();

},{"./tablemodule.js":2}],2:[function(require,module,exports){
'use strict';

Object.defineProperty(exports, "__esModule", {
  value: true
});

var _createClass = function () { function defineProperties(target, props) { for (var i = 0; i < props.length; i++) { var descriptor = props[i]; descriptor.enumerable = descriptor.enumerable || false; descriptor.configurable = true; if ("value" in descriptor) descriptor.writable = true; Object.defineProperty(target, descriptor.key, descriptor); } } return function (Constructor, protoProps, staticProps) { if (protoProps) defineProperties(Constructor.prototype, protoProps); if (staticProps) defineProperties(Constructor, staticProps); return Constructor; }; }();

function _classCallCheck(instance, Constructor) { if (!(instance instanceof Constructor)) { throw new TypeError("Cannot call a class as a function"); } }

/*
     An ES6 module exporting a Table class
     This is ECMA-script 6 (ES6 or ES2015)

     This uses JQuery for DOM maipulation
*/
var Table = exports.Table = function () {
  function Table(rows, cols, data, striped) {
    _classCallCheck(this, Table);

    this.rows = rows;
    this.cols = cols;
    this.data = data;
    this.striped = striped;
  }

  _createClass(Table, [{
    key: 'render',
    value: function render() {
      var tbl = document.createElement('table');
      var tbdy = document.createElement('tbody');
      var tr = document.createElement('tr');
      var elems = this.data;
      var cols = this.cols;
      var rows = this.rows;
      var striped = this.striped;
      var noElems = Array.from(Array(this.rows * this.cols).keys());
      noElems.forEach(function (element) {
        var td = document.createElement('td');
        if (element % (cols * 2) < cols && striped) {
          td.style.background = "lightgrey";
        }
        td.innerHTML = elems[element];
        tr.appendChild(td);
        console.log(element + " : " + cols + " : " + element % cols);
        if (element % cols == cols - 1) {
          tbdy.appendChild(tr);
          tr = document.createElement('tr');
        }
      });
      // TODO
      tbl.appendChild(tbdy);
      console.log(tbdy);
      return tbl;
    }
  }, {
    key: 'edit',
    value: function edit(row, col, value) {
      console.log(this.data);
      this.data[row * this.cols + col] = value;
      console.log(this.data[row * this.cols + col]);
    }
  }]);

  return Table;
}();

},{}]},{},[1,2]);
