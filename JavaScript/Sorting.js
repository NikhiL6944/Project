function sortArrayDescending(arr) {
    return arr.sort((a, b) => b - a);
}

const inputArray = [4, 2, 7, 1, 9];
const sortedArray = sortArrayDescending(inputArray);
console.log(sortedArray); // Output: [9, 7, 4, 2, 1]