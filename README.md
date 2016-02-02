CIS 222, Week 4 Lab
===================


The Problem, really Puzzle 
---------------------------

Here is a puzzle. This is taken directly from NPR (that’s national
public radio, the public radio station) Weekend Edition Sunday Puzzle
with Will Shortz. Shortz is a famous puzzle guy and does a puzzle once a
week for NPR. Some lucky caller is selected and Shortz and Liane Hansen
(the host) do an online quiz with the person (realtime, right there,
amazing). Look at [http://www.npr.org/templates/story/story.php?columnId=4473090](http://www.npr.org/templates/story/story.php?columnId=4473090)


Here is such a puzzle. Shortz gives you a word. You find the anagram to
that word starting with the letter ‘v’. He gives about 13 words, 1 every
15 seconds or so, and you try to come up with the word. In case you
don’t remember, an anagram is the rearrangement of a word’s letters to
make a new word. For example, ‘parental’, ‘prenatal’, and ‘paternal’ are
all anagrams of one another

Your Tasks
----------

Here are 14 words. Find an anagram of those words starting with the
letter ‘v’. Included in the directory is a wordList file of about
230,000 English words. You can use it to look up anagrams.

serve, rival, lovely, caveat, devote, irving, livery, selves, latvian,
saviour, observe, octavian, dovetail, levantine

Hints, doing it in steps
------------------------

1.  Use a Java data structure. Store a key-value pair in the dictionary that we can use to solve
    our problem. Consider two anagrams we know. The words are ‘serve’
    and ‘verse’. Let’s create a string of the sorted list of the letters
    in each word. Thus ‘serve’ is transformed to ‘eersv’, the sorted
    list of its letters. Now think!!! What would ‘verse’ become under
    the same transformation? How can I use that fact to find two
    anagrams in a list of words? The **sorted letters are our key** in
    the dictionary

2. Make sure to close all your files before exiting the program!


