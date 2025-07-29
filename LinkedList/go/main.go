package main

import "fmt"

type Node struct {
	data int32
	next *Node
}
type LinkedList struct {
	head *Node
}

func (ll *LinkedList) add(data int32) {
	newNode := Node{data: data, next: nil}
	if ll.head == nil {
		ll.head = &newNode
	} else {
		current := ll.head
		for current.next != nil {
			current = current.next
		}
		current.next = &newNode
	}
}

func (ll LinkedList) show() {
	current := ll.head
	for current != nil {
		fmt.Print(current.data, "  ")
		current = current.next
	}
}

func main() {
	list := LinkedList{}
	list.add(4)
	list.add(5)
	list.show()
}
