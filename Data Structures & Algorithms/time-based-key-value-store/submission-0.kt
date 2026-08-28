class TimeMap() {

    private val dataStore = HashMap<String, MutableList<Pair<String, Int>>>()

    fun set(key: String, value: String, timestamp: Int) {
        if (!dataStore.containsKey(key)) {
            dataStore[key] = mutableListOf()
        }
        dataStore[key]!!.add(Pair(value, timestamp))
    }

    fun get(key: String, timestamp: Int): String {
        var result = ""
        val values = dataStore[key] ?: return result
        var left = 0
        var right = values.size - 1

        while (left <= right) {
            val middle = (left + right) / 2
            if (values[middle].second <= timestamp) {
                result = values[middle].first
                left = middle + 1
            } else {
                right = middle - 1
            }
        }
        return result
    }

}
