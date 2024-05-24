package org.example.utils

class CustomMutableList<T>() : MutableList<T> {
    private val internalList = mutableListOf<T>()

    override val size: Int
        get() = internalList.size

    override fun contains(element: T): Boolean = internalList.contains(element)

    override fun containsAll(elements: Collection<T>): Boolean = internalList.containsAll(elements)

    override fun get(index: Int): T {
        return if (index in 0 until size) {
            internalList[index]
        } else {
            "" as T
        }
    }

    override fun indexOf(element: T): Int = internalList.indexOf(element)

    override fun isEmpty(): Boolean = internalList.isEmpty()

    override fun iterator(): MutableIterator<T> = internalList.iterator()

    override fun lastIndexOf(element: T): Int = internalList.lastIndexOf(element)

    override fun add(index: Int, element: T) = internalList.add(index, element)

    override fun add(element: T): Boolean = internalList.add(element)

    override fun addAll(index: Int, elements: Collection<T>): Boolean = internalList.addAll(index, elements)

    override fun addAll(elements: Collection<T>): Boolean = internalList.addAll(elements)

    override fun clear() = internalList.clear()

    override fun listIterator(): MutableListIterator<T> = internalList.listIterator()

    override fun listIterator(index: Int): MutableListIterator<T> = internalList.listIterator(index)

    override fun remove(element: T): Boolean = internalList.remove(element)

    override fun removeAll(elements: Collection<T>): Boolean = internalList.removeAll(elements)

    override fun removeAt(index: Int): T = internalList.removeAt(index)

    override fun retainAll(elements: Collection<T>): Boolean = internalList.retainAll(elements)

    override fun set(index: Int, element: T): T = internalList.set(index, element)

    override fun subList(fromIndex: Int, toIndex: Int): MutableList<T> = internalList.subList(fromIndex, toIndex)
}
