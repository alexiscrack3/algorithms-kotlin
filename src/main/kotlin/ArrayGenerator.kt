class ArrayGenerator {

    fun generateUtil(
        arrayA: Array<Int>,
        arrayB: Array<Int>,
        outputArray: Array<Int>,
        indexA: Int,
        indexB: Int,
        lengthA: Int,
        lengthB: Int,
        lem: Int,
        flag: Boolean,
        result: MutableList<Array<Int>>
    ) {
        if (flag) {
            if (lem != 0) {
                val arr = outputArray.copyOfRange(0, lem + 1)
                result.add(arr)
            }

            // Recur for all elements of A after current index
            for (k in indexA until lengthA) {
                if (lem == 0) {
                    /* this block works for the very first call to include
					the first element in the output array */
                    outputArray[lem] = arrayA[k]

                    // don't increment lem as B is included yet
                    generateUtil(arrayA, arrayB, outputArray, k + 1, indexB, lengthA, lengthB, lem, !flag, result)
                } else if (arrayA[k] > outputArray[lem]) {
                    outputArray[lem + 1] = arrayA[k]

                    generateUtil(
                        arrayA,
                        arrayB,
                        outputArray,
                        k + 1,
                        indexB,
                        lengthA,
                        lengthB,
                        lem + 1,
                        !flag,
                        result
                    )
                }
            }
        } else {
            for (l in indexB until lengthB) {
                if (arrayB[l] > outputArray[lem]) {
                    outputArray[lem + 1] = arrayB[l]

                    generateUtil(
                        arrayA,
                        arrayB,
                        outputArray,
                        indexA,
                        l + 1,
                        lengthA,
                        lengthB,
                        lem + 1,
                        !flag,
                        result
                    )
                }
            }
        }
    }

    fun generate(A: Array<Int>, B: Array<Int>, m: Int, n: Int, result: MutableList<Array<Int>>) {
        val C = Array(m + n) { 0 }
        generateUtil(
            arrayA = A,
            arrayB = B,
            outputArray = C,
            indexA = 0,
            indexB = 0,
            lengthA = m,
            lengthB = n,
            lem = 0,
            flag = true,
            result = result
        )
    }
}
