<h2><a href="https://www.geeksforgeeks.org/problems/peak-element/1">Peak element</a></h2><h3>Difficulty Level : Difficulty: Basic</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 14pt;">Given an <em>0-indexed</em> array of integers<em> </em><strong>arr</strong>[]<em>,</em> find its <strong>peak element</strong> and return its index. An element is considered to be <strong>peak</strong> if its value is greater than or equal to the values of its adjacent elements (<em>if they exist</em>).</span></p>
<p><span style="font-size: 14pt;">Note: The output will be <strong>"true"</strong> if the index returned by your function is correct; otherwise, it will be "<strong>false"</strong>.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples :<br></strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>arr = [1, 2, 3]
<strong>Output:</strong> true
<strong>Explanation: </strong>If the index returned is 2, then the output printed will be 1. Since arr[2] = 3 is greater than its adjacent elements, and there is no element after it, we can consider it as a peak element. No other index satisfies the same property, so answer will be printed as 0.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>arr = [1, 1, 1, 2, 1, 1, 1]
<strong>Output: </strong>true<strong>
Explanation: </strong>In this case there are 5 peak elements with indices as {0,1,3,5,6}. Returning any of them will give you correct answer.<br></span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>arr = [1, 1, 1]
<strong>Output: </strong>true<strong>
Explanation: </strong>In this case, all elements are peak elements<span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">.</span></span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong><br>1 ≤ arr.size() ≤ 10<sup>6</sup><br>0 ≤ arr[i] ≤ 10<sup>6</sup></span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Accolite</code>&nbsp;<code>Amazon</code>&nbsp;<code>Visa</code>&nbsp;<code>Adobe</code>&nbsp;<code>Google</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Arrays</code>&nbsp;<code>Searching</code>&nbsp;<code>Data Structures</code>&nbsp;<code>Algorithms</code>&nbsp;