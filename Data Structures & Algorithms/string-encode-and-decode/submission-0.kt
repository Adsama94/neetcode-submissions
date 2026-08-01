class Solution {

    fun encode(strs: List<String>): String {
        val sb = StringBuilder()
        for (str in strs) {
            sb.append(str.length).append('#').append(str)
        }
        return sb.toString()
    }

    fun decode(str: String): List<String> {
        val result = mutableListOf<String>()
        var i = 0

        while (i < str.length) {
            var j = i
            while (str[j] != '#') {
                j++
            }

            val length = str.substring(i, j).toInt()
            val str = str.substring(j + 1, j + 1 + length)
            result.add(str)

            i = j + 1 + length
        }

        return result
    }
}
