class PrefixTree {
    private val root = TrieNode()

    fun insert(word: String) {
        var node = root
        for (char in word) {
            node.children.computeIfAbsent(char) { TrieNode() }
            node = node.children[char]!!
        }
        node.isEndOfWord = true
    }

    fun search(word: String): Boolean {
        val node = searchNode(word)
        return node != null && node.isEndOfWord
    }

    fun startsWith(prefix: String): Boolean {
        val node = searchNode(prefix)
        return node != null
    }

    private fun searchNode(word: String): TrieNode? {
        var node = root
        for (char in word) {
            if (!node.children.containsKey(char)) {
                return null
            }
            node = node.children[char]!!
        }
        return node
    }
}

class TrieNode {
    val children = mutableMapOf<Char, TrieNode>()
    var isEndOfWord = false
}
