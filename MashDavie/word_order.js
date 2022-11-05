// David Kamau Muchiri BS Software Engineering Murang'a University
// Coding challenge day 5

const fs = require('fs')


const word_order = (file) =>{
    
    const data = fs.readFileSync(`./${file}.txt`).toString('utf-8').split("\n");
    let distinctWords = [];

    data.forEach(word =>{
        if(!distinctWords.includes(word)){
            distinctWords.push(word);
        }
    })
    
    let sequenceArray = new Array(distinctWords.length);
    let currentWord = ""
    let wordCount;
    for(let counter1 = 0; counter1 < distinctWords.length; counter1++){
        currentWord = distinctWords[counter1];
        wordCount = 0
        for(let counter2 = 0; counter2 < data.length; counter2++){
            if(currentWord === data[counter2]){
                wordCount = wordCount + 1;
            }
        }
        sequenceArray[counter1] = (wordCount);
    }
    return [distinctWords.length, sequenceArray];
}

console.log(word_order("test2"));
