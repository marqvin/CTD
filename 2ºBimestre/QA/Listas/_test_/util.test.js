const { generateText } = require('../util.js'); 

test('Saída de nome e idade', () => { 
    const text = generateText('Tiago Gomes', 28);
    expect(text).toBe('Tiago Gomes (28 years old)'); 
});