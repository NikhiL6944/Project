let currentInput = '';
let pendingInput = '';
let operator = '';

function appendToDisplay(value) {
    currentInput += value;
    document.getElementById('display').value = currentInput;
}

function clearDisplay() {
    currentInput = '';
    document.getElementById('display').value = '';
}

function calculate() {
    pendingInput = currentInput;
    currentInput = eval(pendingInput);
    document.getElementById('display').value = currentInput;
}

document.addEventListener('keydown', (event) => {
    if (!isNaN(event.key) || ['+', '-', '*', '/', '.'].includes(event.key)) {
        appendToDisplay(event.key);
    } else if (event.key === 'Enter' || event.key === '=') {
        calculate();
    } else if (event.key === 'Escape') {
        clearDisplay();
    }
});
