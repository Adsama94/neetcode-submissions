class WordDictionary {

    private val root = TrieNode()

    fun addWord(word: String) {
        var current = root
        for (char in word) {
            current.children.computeIfAbsent(char) { TrieNode() }
            current = current.children[char]!!
        }
        current.isEndOfWord = true
    }

    fun search(word: String): Boolean {
        return searchInNode(word, root)
    }

    private fun searchInNode(word: String, node: TrieNode): Boolean {
        var currentNode = node
        for (i in word.indices) {
            val char = word[i]
            if (char == '.') {
                for (childNode in currentNode.children.values) {
                    if (searchInNode(word.substring(i + 1), childNode)) {
                        return true
                    }
                }
                return false
            } else if (!currentNode.children.containsKey(char)) {
                return false
            }
            currentNode = currentNode.children[char]!!
        }
        return currentNode.isEndOfWord
    }
}

class TrieNode {
    val children = mutableMapOf<Char, TrieNode>()
    var isEndOfWord = false
}