function reverseWordsInSentence(sentence) {
    // Split the sentence into words
    const words = sentence.split(" ");

    // Reverse each word and store them in an array
    const reversedWords = words.map(word => {
        return word.split("").reverse().join("");
    });

    // Join the reversed words to form the reversed sentence
    return reversedWords.join(" ");
}

const inputSentence = "This is a sunny day";//Enter any sentence here
const reversedSentence = reverseWordsInSentence(inputSentence);
console.log(reversedSentence); // Output: "sihT si a ynnus yad"



