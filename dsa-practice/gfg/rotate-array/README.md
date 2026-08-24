<h2><a href="https://www.geeksforgeeks.org/problems/rotate-array-by-n-elements-1587115621/1">Rotate Array</a></h2> <img src='https://img.shields.io/badge/Difficulty-Easy-brightgreen' alt='Difficulty: Easy' /><hr>

<p>You are given an integer array <code>arr[]</code> and an integer <code>d</code>. Your task is to <strong>rotate the array to the left</strong> by <code>d</code> positions.</p>

<p>After rotating the array, the elements that are shifted out from the beginning are moved to the end of the array.</p>

<p>&nbsp;</p>

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> arr[] = [1, 2, 3, 4, 5], d = 2
<strong>Output:</strong> [3, 4, 5, 1, 2]
<strong>Explanation:</strong> After rotating the array to the left by 2 positions, the first two elements are moved to the end.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> arr[] = [2, 4, 6, 8, 10], d = 3
<strong>Output:</strong> [8, 10, 2, 4, 6]
<strong>Explanation:</strong> Rotating the array to the left by 3 positions moves [2, 4, 6] to the end.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> arr[] = [1, 2, 3, 4], d = 4
<strong>Output:</strong> [1, 2, 3, 4]
<strong>Explanation:</strong> Rotating an array by its length results in the same array.
</pre>

<p>&nbsp;</p>

<p><strong>Constraints:</strong></p>

<ul>
    <li><code>1 &lt;= arr.length &lt;= 10<sup>6</sup></code></li>
    <li><code>0 &lt;= d &lt;= 10<sup>9</sup></code></li>
    <li><code>-10<sup>9</sup> &lt;= arr[i] &lt;= 10<sup>9</sup></code></li>
</ul>

<p>&nbsp;</p>

<p><strong>Expected Time Complexity:</strong> <code>O(n)</code></p>

<p><strong>Expected Auxiliary Space:</strong> <code>O(1)</code></p>

<p>&nbsp;</p>

<strong>Approach:</strong>

<ul>
    <li>First, reduce <code>d</code> using <code>d % n</code>, since rotating the array by <code>n</code> positions results in the same array.</li>
    <li>Reverse the first <code>d</code> elements.</li>
    <li>Reverse the remaining <code>n - d</code> elements.</li>
    <li>Finally, reverse the entire array.</li>
    <li>This reversal technique efficiently rotates the array in-place using <code>O(1)</code> extra space.</li>
</ul>
