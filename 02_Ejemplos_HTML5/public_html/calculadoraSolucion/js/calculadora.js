class Calculadora {
    constructor() {
        //this.result = document.getElementById("resultado");
        this.result = $("#resultado");
        this.anterior = $("#anterior");
        this.mem = 0;
        this.operador = "";
        this.nuevoNum = false;
    }
    numeroPulsado(eventObj) {
        if (this.nuevoNum) {
            this.result.val("0");
            this.nuevoNum = false;
        }
        let valor = eventObj.currentTarget.innerHTML;
        // alert("Pulsado " + valor);
        if (valor === "+/-") {
            this.result.val("" + (-(parseFloat(calculadora.result.val()))));
        } else if (valor === ".") {
            if (!this.result.val().includes("."))
                this.result.val(parseFloat(this.result.val()));
        } else {
            this.result.val(this.result.val() + valor);
            this.result.val(parseFloat(this.result.val()));
        }
    }
    operadorPulsado(evObj) {
        let operadorActual = evObj.currentTarget.innerHTML;

        if (this.operador !== "" || operadorActual === "=") {
            this.calcular();
        }
        this.mem = parseFloat(this.result.val());
        // Subir a caja texto valor anterior y operador

        if (this.operador !== "=" && operadorActual !== "=") {
            this.anterior.val(`${this.mem} ${operadorActual}`);
            this.result.val("0");
            this.operador = operadorActual;
        } else {
            this.operador = "";
            // this.result.anterior.value = this.result.value
        }
        this.nuevoNum = true;
    }
    calcular() {
        if (this.operador !== "=") {
            let valActual = parseFloat(this.result.val());
            let resultado = eval(this.mem.toString() + this.operador + valActual);
            this.result.val(resultado);
        }
    }
}
;
let calculadora = null;


let inicializacion = function () {
    calculadora = new Calculadora();

    $(".num").click((evObj) => {
        calculadora.numeroPulsado(evObj);

    });
    $(".oper").click((evObj) => {
        calculadora.operadorPulsado(evObj);
    });

};
$(document).ready(inicializacion);