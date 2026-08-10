class MedianFinder {
    PriorityQueue<Integer> maxHeap;
    PriorityQueue<Integer> minHeap;

    public MedianFinder() {
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());    
        minHeap = new PriorityQueue<>();    
    }
    
    public void addNum(int num) {
        maxHeap.add(num);
        if(maxHeap.size() > minHeap.size()+1){
            minHeap.offer(maxHeap.poll());
        } else if(!minHeap.isEmpty() && minHeap.peek() < maxHeap.peek()){
            minHeap.offer(maxHeap.poll());
            maxHeap.offer(minHeap.poll()); 
        }
    }
    
    public double findMedian() {
        if(maxHeap.size() == minHeap.size()) return (maxHeap.peek()+minHeap.peek())/2.0;
        return maxHeap.peek();
    }
}
