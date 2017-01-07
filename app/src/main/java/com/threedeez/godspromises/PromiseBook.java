package com.threedeez.godspromises;

import java.util.Random;

public class PromiseBook {
    //Fields (Member Variables) = Properties about the object
    private final String[] promises = new String[]{
            "God's promises are always True. No, I will not break my covenant; I will not take back one word of what I said. Psalm 89:34.",
            "The promises of God are Yes and Amen. “For all the promises of God in him are yea, and in him Amen, unto the glory of God by us.” 2 Corinthians 1:20.",
            "He has promised You abundant blessings. “Multiple blessings if you obey Him”. Deuteronomy 28:1-14",
            "God’s has Promised Finances, and Business/Career Success",
            "You will not lack anything you desire. “Honor the LORD, all His people; those who obey him have all they need.” Psalm 34:9",
            "Every good thing you will not lack, (food, shelter, good job, successful business, name them. “Honor the LORD, all his people; those who obey him have all they need.” Psalm 34:10",
            "God will take care of your daily needs. “So do not start worrying: ‘Where will my food come from? or my drink? or my clothes?” Mathew 6:31",
            "God will take care of your daily needs. “Your Father in heaven knows that you need all these things.” Mathew 6:32",
            "God will take care of your daily needs. “Instead, be concerned above everything else with the Kingdom of God and with what he requires of you, and He will provide you with all these other things.” Mathew 6:33",
            "God will take care of your future. “So do not worry about tomorrow; it will have enough worries of its own. There is no need to add to the troubles each day brings” Mathew 6:34",
            "As you meditate on God’s word your way will be prosperous. “Be sure that the book of the Law is always read in your worship. Study it day and night, and make sure that you obey everything written in it. Then you will be prosperous and successful.” Joshua 1:8",
            "You can Test God to see if He will bless you more than you can hold. “Bring the full amount of your tithes to the Temple, so that there will be plenty of food there. Put me to the test and you will see that I will open the windows of heaven and pour out on you in abundance all kinds of good things.” Malachi 3:10",
            "You can ask God for anything you need. “Don't worry about anything, but in all your prayers ask God for what you need, always asking him with a thankful heart.” Philippians 4:6",
            "God Promises to Supply All Your Needs. “And with all His abundant wealth through Christ Jesus, my God will supply all your needs.” Philippians 4:19",
            "He has promised You will succeed and be fruitful. “I will give you many descendants, and some of them will be kings. You will have so many descendants that they will become nations” Genesis 17:6",
            "God has promised to solve all your problems. “I am the LORD, the God of all people. Nothing is too difficult for me”. Jeremiah 32:27",
            "If God Gave to the World His Best and Most Beloved… “Certainly not God, who did not even keep back His own Son, but offered him for us all! He gave us his Son will he not also freely give us all things? Romans 8:32",
            "He will not hold back anything good from you. “He LORD is our protector and glorious king, blessing us with kindness and honor. He does not refuse any good thing to those who do what is right.” Psalm 84:11",
            "We have been promised eternal life. “And this is the promise that He hath promised us, even eternal life.” 1 John 2:25",
            "God has promised to save your children. “The LORD replies, “That is just what is going to happen. The soldier's prisoners will be taken away, and the tyrant's loot will be seized. I will fight against whoever fights you, and I will rescue your children.” Isaiah 49:25",
            "He has promised that your children will be exceedingly blessed. “I will give water to the thirsty land and make streams flow on the dry ground. I will pour out my spirit on your children and my blessing on your descendants.” Isaiah 44:3",
            "Your children will flourish. “They will thrive like well-watered grass, like willows by streams of running water” Isaiah 44:4",
            "He promised that he will teach your children. “I, myself will teach your people and give them prosperity and peace.” Isaiah 54:13",
            "He has promised that your children will stand out among the outstanding. “They will be famous among the nations; Everyone who sees them will know that they are a people whom I have blessed.” Isaiah 61:9",
            "God promised you will bless you with Children. “Children are a gift from the LORD; they are a real blessing” Psalm 127:3",
            "He has promised to take away your troubles and make you smile again. “I will build your towers with rubies, your gates with stones that glow like fire, and the wall around you with jewels” Isaiah 54:12",
            "He has big plans he will fulfill for you. “I alone know the plans I have for you, plans to bring you prosperity and not disaster, plans to bring about the future you hope for.” Jeremiah 29:11",
            "You can attain a fulfilled life. “And God is able to give you more than you need, so that you will always have all you need for yourselves and more than enough for every good cause” 2 Corinthians 9:8",
            "The LORD is ever kind to you. “He gives generously to the needy; His kindness lasts forever.” 2 Corinthians 9:9",
            "The LORD has promised to provide you with that job, home, name your biggest challenge!. “Happy are those who remain faithful under trials, because when they succeed in passing such a test, they will receive as their reward the life which God has promised to those who love him.",
            "He has promised to make a way where there is no way. “Watch for the new thing I am going to do. It is happening already-you can see it now! I will make a road through the wilderness and give you streams of water there.” Isaiah 43:19",
            "He has promised to make you rich enough to be generous. “He will always make you rich enough to be generous at all times, so that many will thank God for your gifts which they receive from us” 2 Corinthians 9:11",
            "He promised to be with you in times of trouble. “When you pass through deep waters, I will be with you; your troubles will not overwhelm you. When you pass through fire, you will not be burned; the hard trials that come will not hurt you” Isaiah 43:2",
            "God can do the impossible. “Jesus answered, “What is humanly impossible is possible for God.” Luke 18:27",
            "God has Promised You Forgiveness and a New Heart",
            "He has promised forgiveness. “If we confess our sins to God, He will keep His promise and do what is right: He will forgive us our sins and purify us from all our wrongdoing.” 1 John 1:9",
            "He has promised us new hearts and desires. “I will give you a new heart and a new mind. I will take away your stubborn heart of stone and give you an obedient heart.” Ezekiel 36:26",
            "God promises He will remove our sins far from us. “As far as the east is from the west, so far does He remove our sins from us. Psalm 103:12",
            "He promised that our sins will be buried. “You will be merciful to us once again. You will trample our sins underfoot and send them to the bottom of the sea!” Micah 7:19",
            "God Promises to Heal You. “I will make you well again; I will heal your wounds” Jeremiah 30:17",
            "He Heals and Forgives you. “He forgives all my sins and heals all my diseases. He keeps me from the grave and blesses me with love and mercy.” Psalm 103:3-4",
            "God promises you good health if you listen “He said, If you will obey me completely by doing what I consider right and by keeping my commands, I will not punish you with any of the diseases that I brought on the Egyptians. I am the LORD, the one who heals you.” Exodus 15:26",
            "God promised to give you Wisdom and Guide you",
            "He gives wisdom and guidance freely. “But if any of you lack wisdom, you should pray to God, who will give it to you; because God gives generously and graciously to all.” James 1:5",
            "You should trust only in God for wisdom. “Trust in the LORD with all your heart. Never rely on what you think you know.” Proverbs 3:5",
            "He promised to Guide your ways. “If you wander off the road to the right or the left, you will hear his voice behind you saying, “Here is the road. Follow it.”  Isaiah 30:21",
            "He Promised to give you Peace. “You, LORD, give perfect peace to those who keep their purpose firm and put their trust in you.” Isaiah 26:3",
            "He will give you Peace beyond human understanding. “And God's peace, which is far beyond human understanding, will keep your hearts and minds safe in union with Christ Jesus.” Philippians 4:7",
            "God has promised to protect you. “Trust in the LORD forever; He will always protect us.” Isaiah 26:4",
            "He walks with you through your Troubles. “When I am surrounded by troubles, you keep me safe. You oppose my angry enemies and save me by your power.” Psalm 138:7",
            "He has promised to Protect you from harm and danger. “He will cover you with his wings; you will be safe in his care; his faithfulness will protect and defend you” Psalm 91:4",
            "He will deliver you from Fear. “Peace is what I leave with you; it is my own peace that I give you. I do not give it as the world does. Do not be worried and upset; do not be afraid.” John 14:27",
            "You should not be afraid of anything. “You need not fear any dangers at night or sudden attacks during the day or the plagues that strike in the dark or the evils that kill in daylight.” Psalm 91:5-6",
            "He promises Safety. “The LORD is like a strong tower, where the righteous can go and be safe.” Proverbs 18:10",
            "He has promised to grant you favor at that next business adventure or job interview. “The LORD controls the mind of a king as easily as he directs the course of a stream.” Proverbs 21:1",
            "He promises perfect Security. “Those who love your law have perfect security, and there is nothing that can make them fall.” Psalm 119:165",
            "Victory over Temptation. “Every test that you have experienced is the kind that normally comes to people. But God keeps his promise, and he will not allow you to be tested beyond your power to remain firm; at the time you are put to the test, he will give you the strength to endure it, and so provide you with a way out” 1 Corinthians 10:13",
            "He promised to keep the devil away from you. “So then, submit yourselves to God. Resist the Devil, and he will run away from you.” James 4:7",
            "God will Lift you up. “Humble yourselves before the Lord, and He will lift you up.” James 4:10",
            "Jesus promised that He will return. “There are many rooms in my Father's house, and I am going to prepare a place for you. I would not tell you this if it were not so.” John 14:2",
            "You can call John 14 'when in sorrow'",
            "You can call Psalm 27 'when people fail you'",
            "You can call Psalm 121 'when you are in need of security'",
            "You can call Colossians 3:12-17 'when looking for the secret of happiness'",
            "You can visit John 15 'when you want to be prosperous/successful'",
            "You can visit Psalm 126 'when you are discouraged at work/business'",
            "You can visit Psalm 121 'before you set out to travel or go anywhere'",
            "You can visit Psalm 27 'when you are depressed'",
            "You can visit Psalm 90 'when everything ‘seems’ bigger than God'",
            "You can call Psalm 91 'when you need protection or fear for your life'",
            "You can receive Hope from Psalm 139 when ‘God seems far away’",
            "You can call Joshua 1 'when you need courage to finish a difficult task'",
            "You should call Psalm 37 'when your wallet is empty'",
            "You can invite Hebrews 11 'when your faith is wearing off'",
            "You can visit Romans 8:28 & 31 'when things are not working as expected'",
            "You can read Psalm 51 'when you have done wrong'",};


    //Methods = Actions the object can take
    public String getPromise() {
        String Promise = "";
        //Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(promises.length);
        Promise = promises[randomNumber];

        return Promise;
    }
}
