fun countVowels(str : String) : Int {
    var numbers : Int
    var CountOfVowels = 0
    for (numbers in str) {
        if(numbers == 'a' || numbers == 'e' || numbers == 'i' || numbers == 'o' || numbers == 'u') {
            CountOfVowels += 1
        }
    }
    return CountOfVowels
}
