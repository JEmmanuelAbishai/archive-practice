<h2><a href="https://www.geeksforgeeks.org/problems/first-and-last-occurrences-of-x3116/1">First and Last Occurrences of x</a></h2> <img src='https://img.shields.io/badge/Difficulty-Easy-brightgreen' alt='Difficulty: Easy' /><hr>

<p>You are given a <strong>sorted array</strong> <code>arr[]</code> consisting of integers and an integer <code>x</code>. Your task is to find the <strong>first</strong> and <strong>last</strong> occurrences of <code>x</code> in the array.</p>

<p>If <code>x</code> is not present in the array, return <code>[-1, -1]</code>.</p>

<p>&nbsp;</p>

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> arr[] = [1, 3, 5, 5, 5, 5, 67, 123, 125], x = 5
<strong>Output:</strong> [2, 5]
<strong>Explanation:</strong> The first occurrence of 5 is at index 2 and the last occurrence is at index 5.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> arr[] = [1, 2, 3, 4, 5], x = 6
<strong>Output:</strong> [-1, -1]
<strong>Explanation:</strong> The element 6 is not present in the array.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> arr[] = [2, 2, 2, 2, 2], x = 2
<strong>Output:</strong> [0, 4]
<strong>Explanation:</strong> The first occurrence of 2 is at index 0 and the last occurrence is at index 4.
</pre>

<p>&nbsp;</p>

<p><strong>Constraints:</strong></p>

<ul>
    <li><code>1 &lt;= arr.length &lt;= 10<sup>6</sup></code></li>
    <li><code>-10<sup>9</sup> &lt;= arr[i] &lt;= 10<sup>9</sup></code></li>
    <li><code>-10<sup>9</sup> &lt;= x &lt;= 10<sup>9</sup></code></li>
    <li><code>arr[]</code> is sorted in non-decreasing order.</li>
</ul>

<p>&nbsp;</p>

<p><strong>Expected Time Complexity:</strong> <code>O(log n)</code></p>

<p><strong>Expected Auxiliary Space:</strong> <code>O(1)</code></p>

<p>&nbsp;</p>

<strong>Approach:</strong>

<ul>
    <li>Use <strong>Binary Search</strong> to find the first occurrence of <code>x</code>.</li>
    <li>Whenever <code>x</code> is found, store its index and continue searching in the <strong>left half</strong>.</li>
    <li>Use another <strong>Binary Search</strong> to find the last occurrence of <code>x</code>.</li>
    <li>Whenever <code>x</code> is found, store its index and continue searching in the <strong>right half</strong>.</li>
    <li>If <code>x</code> is not found, both searches return <code>-1</code>.</li>
</ul>
