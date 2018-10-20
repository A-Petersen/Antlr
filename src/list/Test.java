package list;


import multiMenge.Multiset;
import set.Set;
import map.Map;
import static map.Map.*;
import static map.ListMap.*;
import static list.List.*;
import static multiMenge.ListMultiset.multiSet;
import static set.ListSet.*;


/**
 * Created by n0ld on 14.05.2017.
 */
public class Test {
    public static void main(String[] args) {

//        Map<Integer, String> m = map();
//        m = m.put(1,"abcd");
//        m = m.put(1,"abc");
//        m.put(5,"");
//        m = m.put(2,"def");
////        m = m.remove(2);
//        System.out.println(m.toString());

//        List<Integer> ex1 = list(1,1,4,2, 2, 3,4,5,6,7);
//        System.out.println(ex1.setHead(4));
//        Map<Integer, List<Integer>> m1  =  ex1.groupBy(x -> x > 1 ? 1 : 2);
//        System.out.println(m1.toString());
//        Set<Integer> sss = set(ex1);
//        System.out.println(ex1);
//        ex1 = ex1.distinct();
//        System.out.println(ex1);

//        Set<Integer> s1 = set();
//
//        ex1.cons(4);
//        System.out.println(ex1.cons(4));
//
//        System.out.println(ex1.isEmpty());
//        System.out.println(ex1.reverse());
//        System.out.println(ex1.length());
//        System.out.println(ex1.setHead(0));
//        System.out.println(ex1.init());
//        System.out.println(ex1.concat(ex1,ex1));
//        System.out.println(ex1.exists(x -> x == 0));
//        System.out.println(ex1.length());
//        System.out.println(ex1.elem(1));
//        System.out.println(ex1.filter(x -> x > 2));
//        System.out.println(ex1.forAll(x -> x < 3));
//
//
//        Set<Integer> ls = set(1,2,3,5,4);
//        Set<Integer> ls1 = set();
//
//        System.out.println(ls1.isEmpty());
//        System.out.println(ls1.member(2));
//        System.out.println(ls);
//        System.out.println(ls.isEmpty() + "-" + ls);
//        System.out.println(ls.isEmpty() + "-" + ls);
//
//        System.out.println(ls1.insert(1).remove(1) + "" + ls1);
//        System.out.println("xy " + (1 == 1 ? ls1.insert(1).remove(1).isEqualTo(ls1.remove(1))
//                : ls1.insert(1).remove(1) == ls1.remove(1).insert(1)) + " xy");


//        Multiset<String> ms = multiSet("a", "b", "b");
//        ms = ms.insert("b");
//        System.out.println(ms.size());
//        ms = ms.remove("d");
//        System.out.println(ms.size());
//        ms = ms.remove("b");
//        System.out.println(ms.size());
////        System.out.println( ms);
//        Multiset<String> ms1 = multiSet();
//        ms1 = ms1.remove("b");
//        System.out.println(ms1.member("b"));
//        System.out.println(ms1.isEqualTo(ms1) + "!" + ms1.isSubsetOf(ms1));


        String str = "The Project Gutenberg EBook of An Essay Concerning Humane Understanding,\n" +
                "Volume II., by John Locke\n" +
                "\n" +
                "This eBook is for the use of anyone anywhere at no cost and with\n" +
                "almost no restrictions whatsoever.  You may copy it, give it away or\n" +
                "re-use it under the terms of the Project Gutenberg License included\n" +
                "with this eBook or online at www.gutenberg.net\n" +
                "\n" +
                "\n" +
                "Title: An Essay Concerning Humane Understanding, Volume II.\n" +
                "       MDCXC, Based on the 2nd Edition, Books III. and IV. (of 4)\n" +
                "\n" +
                "Author: John Locke\n" +
                "\n" +
                "Release Date: January 6, 2004 [EBook #10616]\n" +
                "\n" +
                "Language: English\n" +
                "\n" +
                "\n" +
                "*** START OF THIS PROJECT GUTENBERG EBOOK HUMANE UNDERSTANDING, V2 ***\n" +
                "\n" +
                "\n" +
                "Produced by Steve Harris and David Widger\n" +
                "\n" +
                "\n" +
                "\n" +
                "AN ESSAY CONCERNING HUMAN UNDERSTANDING\n" +
                "\n" +
                "BY\n" +
                "\n" +
                "JOHN LOCKE\n" +
                "\n" +
                "[Based on the 2d Edition] CONTENTS OF THE SECOND VOLUME\n" +
                "\n" +
                "\n" +
                "BOOK IV.  OF KNOWLEDGE AND PROBABILITY.\n" +
                "\n" +
                "\n" +
                "CHAPTER XVI. OF THE DEGREES OF ASSENT.\n" +
                "\n" +
                "\n" +
                "1. Our Assent ought to be regulated by the Grounds of Probability.\n" +
                "\n" +
                "The grounds of probability we have laid down in the foregoing chapter:\n" +
                "as they are the foundations on which our ASSENT is built, so are they\n" +
                "also the measure whereby its several degrees are, or ought to be\n" +
                "regulated: only we are to take notice, that, whatever grounds of\n" +
                "probability there may be, they yet operate no further on the mind which\n" +
                "searches after truth, and endeavours to judge right, than they appear;\n" +
                "at least, in the first judgment or search that the mind makes. I\n" +
                "confess, in the opinions men have, and firmly stick to in the world,\n" +
                "their assent is not always from an actual view of the reasons that at\n" +
                "first prevailed with them: it being in many cases almost impossible, and\n" +
                "in most, very hard, even for those who have very admirable memories, to\n" +
                "retain all the proofs which, upon a due examination, made them embrace\n" +
                "that side of the question. It suffices that they have once with care\n" +
                "and fairness sifted the matter as far as they could; and that they have\n" +
                "searched into all the particulars, that they could imagine to give any\n" +
                "light to the question; and, with the best of their skill, cast up the\n" +
                "account upon the whole evidence: and thus, having once found on which\n" +
                "side the probability appeared to THEM, after as full and exact an\n" +
                "inquiry as they can make, they lay up the conclusion in their memories,\n" +
                "as a truth they have discovered; and for the future they remain\n" +
                "satisfied with the testimony of their memories, that this is the opinion\n" +
                "that, by the proofs they have once seen of it, deserves such a degree of\n" +
                "their assent as they afford it.\n" +
                "\n" +
                "\n" +
                "2. These can not always be actually in View; and then we must content\n" +
                "ourselves with the remembrance that we once saw ground for such a Degree\n" +
                "of Assent.\n" +
                "\n" +
                "This is all that the greatest part of men are capable of doing, in\n" +
                "regulating their opinions and judgments; unless a man will exact of\n" +
                "them, either to retain distinctly in their memories all the proofs\n" +
                "concerning any probable truth, and that too, in the same order, and\n" +
                "regular deduction of consequences in which they have formerly placed\n" +
                "or seen them; which sometimes is enough to fill a large volume on one\n" +
                "single question: or else they must require a man, for every opinion that\n" +
                "he embraces, every day to examine the proofs: both which are impossible.\n" +
                "It is unavoidable, therefore, that the memory be relied on in the case,\n" +
                "and that men be persuaded of several opinions, whereof the proofs are\n" +
                "not actually in their thoughts; nay, which perhaps they are not able\n" +
                "actually to recall. Without this, the greatest part of men must be\n" +
                "either very sceptics; or change every moment, and yield themselves up\n" +
                "to whoever, having lately studied the question, offers them arguments,\n" +
                "which, for want of memory, they are not able presently to answer.\n" +
                "\n" +
                "\n" +
                "3. The ill consequence of this, if our former Judgments were not rightly\n" +
                "made.\n" +
                "\n" +
                "I cannot but own, that men's sticking to their past judgment, and\n" +
                "adhering firmly to conclusions formerly made, is often the cause of\n" +
                "great obstinacy in error and mistake. But the fault is not that they\n" +
                "rely on their memories for what they have before well judged, but\n" +
                "because they judged before they had well examined. May we not find a\n" +
                "great number (not to say the greatest part) of men that think they have\n" +
                "formed right judgments of several matters; and that for no other reason,\n" +
                "but because they never thought otherwise? that themselves to have judged\n" +
                "right, only because they never questioned, never examined, their own\n" +
                "opinions? Which is indeed to think they judged right, because they never\n" +
                "judged at all. And yet these, of all men, hold their opinions with the\n" +
                "greatest stiffness; those being generally the most fierce and firm in\n" +
                "their tenets, who have least examined them. What we once KNOW, we are\n" +
                "certain is so: and we may be secure, that there are no latent proofs\n" +
                "undiscovered, which may overturn our knowledge, or bring it in doubt.\n" +
                "But, in matters of PROBABILITY, it is not in every case we can be sure\n" +
                "that we have all the particulars before us, that any way concern the\n" +
                "question; and that there is no evidence behind, and yet unseen, which\n" +
                "may cast the probability on the other side, and outweigh all that at\n" +
                "present seems to preponderate with us. Who almost is there that hath\n" +
                "the leisure, patience, and means to collect together all the proofs\n" +
                "concerning most of the opinions he has, so as safely to conclude that he\n" +
                "hath a clear and full view; and that there is no more to be alleged for\n" +
                "his better information? And yet we are forced to determine ourselves on\n" +
                "the one side or other. The conduct of our lives, and the management of\n" +
                "our great concerns, will not bear delay: for those depend, for the most\n" +
                "part, on the determination of our judgment in points wherein we are\n" +
                "not capable of certain and demonstrative knowledge, and wherein it is\n" +
                "necessary for us to embrace the one side or the other.\n" +
                "\n" +
                "\n" +
                "4. The right Use of it, mutual Charity and Forbearance, in a necessary\n" +
                "diversity of opinions.\n" +
                "\n" +
                "Since, therefore, it is unavoidable to the greatest part of men, if not\n" +
                "all, to have several OPINIONS, without certain and indubitable proofs\n" +
                "of their truth; and it carries too great an imputation of ignorance,\n" +
                "lightness, or folly for men to quit and renounce their former tenets\n" +
                "presently upon the offer of an argument which they cannot immediately\n" +
                "answer, and show the insufficiency of: it would, methinks, become\n" +
                "all men to maintain peace, and the common offices of humanity, and\n" +
                "friendship, in the diversity of opinions; since we cannot reasonably\n" +
                "expect that any one should readily and obsequiously quit his own\n" +
                "opinion, and embrace ours, with a blind resignation to an authority\n" +
                "which the understanding of man acknowledges not. For however it may\n" +
                "often mistake, it can own no other guide but reason, nor blindly submit\n" +
                "to the will and dictates of another. If he you would bring over to your\n" +
                "sentiments be one that examines before he assents, you must give him\n" +
                "leave at his leisure to go over the account again, and, recalling what\n" +
                "is out of his mind, examine all the particulars, to see on which side\n" +
                "the advantage lies: and if he will not think our arguments of weight\n" +
                "enough to engage him anew in so much pains, it is but what we often do\n" +
                "ourselves in the like case; and we should take it amiss if others should\n" +
                "prescribe to us what points we should study. And if he be one who takes\n" +
                "his opinions upon trust, how can we imagine that he should renounce\n" +
                "those tenets which time and custom have so settled in his mind, that he\n" +
                "thinks them self-evident, and of an unquestionably certainty; or which\n" +
                "he takes to be impressions he has received from God himself, or from men\n" +
                "sent by him? How can we expect, I say, that opinions thus settled should\n" +
                "be given up to the arguments or authority of a stranger or adversary,\n" +
                "especially if there be any suspicion of interest or design, as there\n" +
                "never fails to be, where men find themselves ill-trusted? We should do\n" +
                "well to commiserate our mutual ignorance, and endeavour to remove it in\n" +
                "all the gentle and fair ways of information; and not instantly treat\n" +
                "others ill, as obstinate and perverse, because they will not renounce\n" +
                "their own, and receive our opinions, or at least those we would force\n" +
                "upon them, when it is more than probable that we are no less obstinate\n" +
                "in not embracing some of theirs. For where is the man that has\n" +
                "incontestable evidence of the truth of all that he holds, or of the\n" +
                "falsehood of all he condemns; or can say that he has examined to the\n" +
                "bottom all his own, or other men's opinions? The necessity of believing\n" +
                "without knowledge, nay often upon very slight grounds, in this fleeting\n" +
                "state of action and blindness we are in, should make us more busy and\n" +
                "careful to inform ourselves than constrain others. At least, those who\n" +
                "have not thoroughly examined to the bottom all their own tenets, must\n" +
                "confess they are unfit to prescribe to others; and are unreasonable in\n" +
                "imposing that as truth on other men's belief, which they themselves have\n" +
                "not searched into, nor weighed the arguments of probability, on which\n" +
                "they should receive or reject it. Those who have fairly and truly\n" +
                "examined, and are thereby got past doubt in all the doctrines they\n" +
                "profess and govern themselves by, would have a juster pretence to\n" +
                "require others to follow them: but these are so few in number, and find\n" +
                "so little reason to be magisterial in their opinions, that nothing\n" +
                "insolent and imperious is to be expected from them: and there is reason\n" +
                "to think, that, if men were better instructed themselves, they would be\n" +
                "less imposing on others.\n" +
                "\n" +
                "\n" +
                "5. Probability is either of sensible Matter of Fact, capable of human\n" +
                "testimony, or of what is beyond the evidence of our senses.\n" +
                "\n" +
                "But to return to the grounds of assent, and the several degrees of it,\n" +
                "we are to take notice, that the propositions we receive upon inducements\n" +
                "of PROBABILITY are of TWO SORTS: either concerning some particular\n" +
                "existance, or, as it is usually termed, matter of fact, which, falling\n" +
                "under observation, is capable of human testimony; or else concerning\n" +
                "things, which being beyond the discovery of our senses, are not capable\n" +
                "of any such testimony.\n" +
                "\n" +
                "\n" +
                "6. Concerning the FIRST of these, viz. PARTICULAR MATTER OF FACT.\n" +
                "\n" +
                "I. The concurrent Experience of ALL other Men with ours, produces\n" +
                "Assurance approaching to Knowledge.\n" +
                "\n" +
                "Where any particular thing, consonant to the constant observation of\n" +
                "ourselves and others in the like case, comes attested by the concurrent\n" +
                "reports of all that mention it, we receive it as easily, and build as\n" +
                "firmly upon it, as if it were certain knowledge; and we reason and act\n" +
                "thereupon with as little doubt as if it were perfect demonstration.\n" +
                "Thus, if all Englishmen, who have occasion to mention it, should affirm\n" +
                "that it froze in England the last winter, or that there were swallows\n" +
                "seen there in the summer, I think a man could almost as little doubt of\n" +
                "it as that seven and four are eleven. The first, therefore, and HIGHEST\n" +
                "DEGREE OF PROBABILITY, is, when the general consent of all men, in all\n" +
                "ages, as far as it can be known, concurs with a man's constant and\n" +
                "never-failing experience in like cases, to confirm the truth of any\n" +
                "particular matter of fact attested by fair witnesses: such are all\n" +
                "the stated constitutions and properties of bodies, and the regular\n" +
                "proceedings of causes and effects in the ordinary course of nature. This\n" +
                "we call an argument from the nature of things themselves. For what our\n" +
                "own and other men's CONSTANT OBSERVATION has found always to be after\n" +
                "the same manner, that we with reason conclude to be the effect of\n" +
                "steady and regular causes; though they come not within the reach of our\n" +
                "knowledge. Thus, That fire warmed a man, made lead fluid, and changed\n" +
                "the colour or consistency in wood or charcoal; that iron sunk in\n" +
                "water, and swam in quicksilver: these and the like propositions about\n" +
                "particular facts, being agreeable to our constant experience, as often\n" +
                "as we have to do with these matters; and being generally spoke of (when\n" +
                "mentioned by others) as things found constantly to be so, and therefore\n" +
                "not so much as controverted by anybody--we are put past doubt that a\n" +
                "relation affirming any such thing to have been, or any predication\n" +
                "that it will happen again in the same manner, is very true. These\n" +
                "PROBABILITIES rise so near to CERTAINTY, that they govern our thoughts\n" +
                "as absolutely, and influence all our actions as fully, as the most\n" +
                "evident demonstration; and in what concerns us we make little or\n" +
                "no difference between them and certain knowledge. Our belief, thus\n" +
                "grounded, rises to ASSURANCE.\n" +
                "\n" +
                "\n" +
                "7. II. Unquestionable Testimony, and our own Experience that a thing is\n" +
                "for the most part so, produce Confidence.\n" +
                "\n" +
                "The NEXT DEGREE OF PROBABILITY is, when I find by my own experience, and\n" +
                "the agreement of all others that mention it, a thing to be for the most\n" +
                "part so, and that the particular instance of it is attested by many and\n" +
                "undoubted witnesses: v.g. history giving us such an account of men in\n" +
                "all ages, and my own experience, as far as I had an opportunity to\n" +
                "observe, confirming it, that most men prefer their private advantage to\n" +
                "the public: if all historians that write of Tiberius, say that Tiberius\n" +
                "did so, it is extremely probable. And in this case, our assent has a\n" +
                "sufficient foundation to raise itself to a degree which we may call\n" +
                "CONFIDENCE.\n" +
                "\n" +
                "\n" +
                "8. III. Fair Testimony, and the Nature of the Thing indifferent, produce\n" +
                "unavoidable Assent.\n" +
                "\n" +
                "In things that happen indifferently, as that a bird should fly this or\n" +
                "that way; that it should thunder on a man's right or left hand, &c.,\n" +
                "when any particular matter of fact is vouched by the concurrent\n" +
                "testimony of unsuspected witnesses, there our assent is also\n" +
                "UNAVOIDABLE. Thus: that there is such a city in Italy as Rome: that\n" +
                "about one thousand seven hundred years ago, there lived in it a man,\n" +
                "called Julius Caesar; that he was a general, and that he won a battle\n" +
                "against another, called Pompey. This, though in the nature of the thing\n" +
                "there be nothing for nor against it, yet being related by historians of\n" +
                "credit, and contradicted by no one writer, a man cannot avoid believing\n" +
                "it, and can as little doubt of it as he does of the being and actions of\n" +
                "his own acquaintance, whereof he himself is a witness.\n" +
                "\n" +
                "\n" +
                "9. Experience and Testimonies clashing, infinitely vary the Degrees of\n" +
                "Probability.\n" +
                "\n" +
                "Thus far the matter goes easy enough. Probability upon such grounds\n" +
                "carries so much evidence with it, that it naturally determines the\n" +
                "judgment, and leaves us as little liberty to believe or disbelieve, as a\n" +
                "demonstration does, whether we will know, or be ignorant. The difficulty\n" +
                "is, when testimonies contradict common experience, and the reports of\n" +
                "history and witnesses clash with the ordinary course of nature, or with\n" +
                "one another; there it is, where diligence, attention, and exactness are\n" +
                "required, to form a right judgment, and to proportion the assent to the\n" +
                "different evidence and probability of the thing: which rises and\n" +
                "falls, according as those two foundations of credibility, viz. COMMON\n" +
                "OBSERVATION IN LIKE CASES, and PARTICULAR TESTIMONIES IN THAT PARTICULAR\n" +
                "INSTANCE, favour or contradict it. These are liable to so great\n" +
                "variety of contrary observations, circumstances, reports, different\n" +
                "qualifications, tempers, designs, oversights, &c., of the reporters,\n" +
                "that it is impossible to reduce to precise rules the various degrees\n" +
                "wherein men give their assent. This only may be said in general, That\n" +
                "as the arguments and proofs PRO and CON, upon due examination, nicely\n" +
                "weighing every particular circumstance, shall to any one appear, upon\n" +
                "the whole matter, in a greater or less degree to preponderate on\n" +
                "either side; so they are fitted to produce in the mind such different\n" +
                "entertainments, as we call BELIEF, CONJECTURE, GUESS, DOUBT, WAVERING,\n" +
                "DISTRUST, DISBELIEF, &c.\n" +
                "\n" +
                "\n" +
                "10. Traditional Testimonies, the further removed the less their Proof\n" +
                "becomes.\n" +
                "\n" +
                "This is what concerns assent in matters wherein testimony is made use\n" +
                "of: concerning which, I think, it may not be amiss to take notice of a\n" +
                "rule observed in the law of England; which is, That though the attested\n" +
                "copy of a record be good proof, yet the copy of a copy, ever so well\n" +
                "attested, and by ever so credible witnesses, will not be admitted as a\n" +
                "proof in judicature. This is so generally approved as reasonable,\n" +
                "and suited to the wisdom and caution to be used in our inquiry after\n" +
                "material truths, that I never yet heard of any one that blamed it.\n" +
                "This practice, if it be allowable in the decisions of right and wrong,\n" +
                "carries this observation along with it, viz. THAT ANY TESTIMONY, THE\n" +
                "FURTHER OFF IT IS FROM THE ORIGINAL TRUTH, THE LESS FORCE AND PROOF IT\n" +
                "HAS. The being and existence of the thing itself, is what I call the\n" +
                "original truth. A credible man vouching his knowledge of it is a good\n" +
                "proof; but if another equally credible do witness it from his report,\n" +
                "the testimony is weaker: and a third that attests the hearsay of an\n" +
                "hearsay is yet less considerable. So that in traditional truths, each\n" +
                "remove weakens the force of the proof: and the more hands the tradition\n" +
                "has successively passed through, the less strength and evidence does\n" +
                "it receive from them. This I thought necessary to be taken notice of:\n" +
                "because I find amongst some men the quite contrary commonly practised,\n" +
                "who look on opinions to gain force by growing older; and what a thousand\n" +
                "years since would not, to a rational man contemporary with the first\n" +
                "voucher, have appeared at all probable, is now urged as certain beyond\n" +
                "all question, only because several have since, from him, said it one\n" +
                "after another. Upon this ground propositions, evidently false or\n" +
                "doubtful enough in their first beginning, come, by an inverted rule of\n" +
                "probability, to pass for authentic truths; and those which found or\n" +
                "deserved little credit from the mouths of their first authors, are\n" +
                "thought to grow venerable by age, are urged as undeniable.\n" +
                "\n" +
                "\n" +
                "11. Yet History is of great Use.\n" +
                "\n" +
                "I would not be thought here to lessen the credit and use of HISTORY: it\n" +
                "is all the light we have in many cases, and we receive from it a great\n" +
                "part of the useful truths we have, with a convincing evidence. I think\n" +
                "nothing more valuable than the records of antiquity: I wish we had more\n" +
                "of them, and more uncorrupted. But this truth itself forces me to say,\n" +
                "That no probability can rise higher than its first original. What has no\n" +
                "other evidence than the single testimony of one only witness must stand\n" +
                "or fall by his only testimony, whether good, bad, or indifferent; and\n" +
                "though cited afterwards by hundreds of others, one after another, is so\n" +
                "far from receiving any strength thereby, that it is only the weaker.\n" +
                "Passion, interest, inadvertency, mistake of his meaning, and a thousand\n" +
                "odd reasons, or capricios, men's minds are acted by, (impossible to\n" +
                "be discovered,) may make one man quote another man's words or meaning\n" +
                "wrong. He that has but ever so little examined the citations of writers,\n" +
                "cannot doubt how little credit the quotations deserve, where the\n" +
                "originals are wanting; and consequently how much less quotations of\n" +
                "quotations can be relied on. This is certain, that what in one age was\n" +
                "affirmed upon slight grounds, can never after come to be more valid in\n" +
                "future ages by being often repeated. But the further still it is from\n" +
                "the original, the less valid it is, and has always less force in the\n" +
                "mouth or writing of him that last made use of it than in his from whom\n" +
                "he received it.\n" +
                "\n" +
                "\n" +
                "12. Secondly, In things which Sense cannot discover, Analogy is the\n" +
                "great Rule of Probability.\n" +
                "\n" +
                "[SECONDLY], The probabilities we have hitherto mentioned are only such\n" +
                "as concern matter of fact, and such things as are capable of observation\n" +
                "and testimony. There remains that other sort, concerning which men\n" +
                "entertain opinions with variety of assent, though THE THINGS BE SUCH,\n" +
                "THAT FALLING NOT UNDER THE REACH OF OUR SENSES, THEY ARE NOT CAPABLE OF\n" +
                "TESTIMONY. Such are, 1. The existence, nature and operations of finite\n" +
                "immaterial beings without us; as spirits, angels, devils, &c. Or the\n" +
                "existence of material beings which, either for their smallness in\n" +
                "themselves or remoteness from us, our senses cannot take notice of--as,\n" +
                "whether there be any plants, animals, and intelligent inhabitants in\n" +
                "the planets, and other mansions of the vast universe. 2. Concerning\n" +
                "the manner of operation in most parts of the works of nature: wherein,\n" +
                "though we see the sensible effects, yet their causes are unknown, and we\n" +
                "perceive not the ways and manner how they are produced. We see animals\n" +
                "are generated, nourished, and move; the loadstone draws iron; and the\n" +
                "parts of a candle, successively melting, turn into flame, and give us\n" +
                "both light and heat. These and the like effects we see and know: but the\n" +
                "causes that operate, and the manner they are produced in, we can only\n" +
                "guess and probably conjecture. For these and the like, coming not within\n" +
                "the scrutiny of human senses, cannot be examined by them, or be attested\n" +
                "by anybody; and therefore can appear more or less probable, only as they\n" +
                "more or less agree to truths that are established in our minds, and as\n" +
                "they hold proportion to other parts of our knowledge and observation.\n" +
                "ANALOGY in these matters is the only help we have, and it is from that\n" +
                "alone we draw all our grounds of probability. Thus, observing that the\n" +
                "bare rubbing of two bodies violently one upon another, produces heat,\n" +
                "and very often fire itself, we have reason to think, that what we call\n" +
                "HEAT and FIRE consists in a violent agitation of the imperceptible\n" +
                "minute parts of the burning matter. Observing likewise that the\n" +
                "different refractions of pellucid bodies produce in our eyes the\n" +
                "different appearances of several colours; and also, that the different\n" +
                "ranging and laying the superficial parts of several bodies, as of\n" +
                "velvet, watered silk, &c., does the like, we think it probable that\n" +
                "the COLOUR and shining of bodies is in them nothing but the different\n" +
                "arrangement and refraction of their minute and insensible parts. Thus,\n" +
                "finding in all parts of the creation, that fall under human observation,\n" +
                "that there is A GRADUAL CONNEXION OF ONE WITH ANOTHER, WITHOUT ANY GREAT\n" +
                "OR DISCERNIBLE GAPS BETWEEN, IN ALL THAT GREAT VARIETY OF THINGS WE SEE\n" +
                "IN THE WORLD, which are so closely linked together, that, in the several\n" +
                "ranks of beings, it is not easy to discover the bounds betwixt them; we\n" +
                "have reason to be persuaded that, BY SUCH GENTLE STEPS, things ascend\n" +
                "upwards in degrees of perfection. It is a hard matter to say where\n" +
                "sensible and rational begin, and where insensible and irrational end:\n" +
                "and who is there quick-sighted enough to determine precisely which is\n" +
                "the lowest species of living things, and which the first of those which\n" +
                "have no life? Things, as far as we can observe, lessen and augment, as\n" +
                "the quantity does in a regular cone; where, though there be a manifest\n" +
                "odds betwixt the bigness of the diameter at a remote distance, yet the\n" +
                "difference between the upper and under, where they touch one another, is\n" +
                "hardly discernible. The difference is exceeding great between some men\n" +
                "and some animals: but if we will compare the understanding and abilities\n" +
                "of some men and some brutes, we shall find so little difference, that it\n" +
                "will be hard to say, that that of the man is either clearer or larger.\n" +
                "Observing, I say, such gradual and gentle descents downwards in those\n" +
                "parts of the creation that are beneath man, the rule of analogy may make\n" +
                "it probable, that it is so also in things above us and our observation;\n" +
                "and that there are several ranks of intelligent beings, excelling us in\n" +
                "several degrees of perfection, ascending upwards towards the infinite\n" +
                "perfection of the Creator, by gentle steps and differences, that are\n" +
                "every one at no great distance from the next to it. This sort of\n" +
                "probability, which is the best conduct of rational experiments, and the\n" +
                "rise of hypothesis, has also its use and influence; and a wary reasoning\n" +
                "from analogy leads us often into the discovery of truths and useful\n" +
                "productions, which would otherwise lie concealed.\n" +
                "\n" +
                "\n" +
                "13. One Case where contrary Experience lessens not the Testimony.\n" +
                "\n" +
                "Though the common experience and the ordinary course of things have\n" +
                "justly a mighty influence on the minds of men, to make them give or\n" +
                "refuse credit to anything proposed to their belief; yet there is one\n" +
                "case, wherein the strangeness of the fact lessens not the assent to\n" +
                "a fair testimony given of it. For where such supernatural events are\n" +
                "suitable to ends aimed at by Him who has the power to change the course\n" +
                "of nature, there, UNDER SUCH CIRCUMSTANCES, that may be the fitter to\n" +
                "procure belief, by how much the more they are beyond or contrary to\n" +
                "ordinary observation. This is the proper case of MIRACLES, which, well\n" +
                "attested, do not only find credit themselves, but give it also to other\n" +
                "truths, which need such confirmation.\n" +
                "\n" +
                "\n" +
                "14. The bare Testimony of Divine Revelation is the highest Certainty.\n" +
                "\n" +
                "Besides those we have hitherto mentioned, there is one sort of\n" +
                "propositions that challenge the highest degree of our assent, upon bare\n" +
                "testimony, whether the thing proposed agree or disagree with common\n" +
                "experience, and the ordinary course of things, or no. The reason whereof\n" +
                "is, because the testimony is of such an one as cannot deceive nor be\n" +
                "deceived: and that is of God himself. This carries with it an assurance\n" +
                "beyond doubt, evidence beyond exception. This is called by a peculiar\n" +
                "name, REVELATION, and our assent to it, FAITH, which [as absolutely\n" +
                "determines our minds, and as perfectly excludes all wavering,] as our\n" +
                "knowledge itself; and we may as well doubt of our own being, as we can\n" +
                "whether any revelation from God be true. So that faith is a settled and\n" +
                "sure principle of assent and assurance, and leaves no manner of room\n" +
                "for doubt or hesitation. ONLY WE MUST BE SURE THAT IT BE A DIVINE\n" +
                "REVELATION, AND THAT WE UNDERSTAND IT RIGHT: else we shall expose\n" +
                "ourselves to all the extravagancy of enthusiasm, and all the error of\n" +
                "wrong principles, if we have faith and assurance in what is not DIVINE\n" +
                "revelation. And therefore, in those cases, our assent can be rationally\n" +
                "no higher than the evidence of its being a revelation, and that this is\n" +
                "the meaning of the expressions it is delivered in. If the evidence of\n" +
                "its being a revelation, or that this is its true sense, be only on\n" +
                "probable proofs, our assent can reach no higher than an assurance or\n" +
                "diffidence, arising from the more or less apparent probability of the\n" +
                "proofs. But of FAITH, and the precedency it ought to have before other\n" +
                "arguments of persuasion, I shall speak more hereafter; where I treat of\n" +
                "it as it is ordinarily placed, in contradistinction to reason; though in\n" +
                "truth it be nothing else but AN ASSENT FOUNDED ON THE HIGHEST REASON.\n" +
                "\n";

        Multiset<String> worte = multiSet();
        str = str.toLowerCase();
        String dummy = "";
        for (char c : str.toCharArray()) {
            boolean merker = false;
            if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
                dummy = dummy + c;
                merker = false;
            } else {
                if (!merker) worte = worte.insert(dummy);
                dummy = "";
                merker = true;
            }
        }
        System.out.println(worte);


//        String str1 = "x x x x proofs. But of FAITH, and the precedency it ought to have before other\n" +
//                "arguments of persuasion, I shall speak more hereafter; where I treat of\n" +
//                "it as it is ordinarily placed, in contradistinction to reason; though in\n" +
//                "truth it be nothing else but AN ASSENT FOUNDED ON THE HIGHEST REASON.\n" +
//                "\n";

//        Multiset<String> buchstaben = multiset();
//        buchstaben = buchstaben.insert('x' + "");
//        buchstaben = buchstaben.insert('x' + "");
//        buchstaben = buchstaben.insert('x' + "");
//        char ab = 'x';
//        String xy = ab + "";
//        char ab1 = 'x';
//        String xy1 = ab + "";
//        buchstaben = buchstaben.insert(xy);
//        buchstaben = buchstaben.insert(xy);
//        System.out.println(buchstaben.member(xy1));
//        System.out.println(buchstaben.count(xy1));
//        buchstaben = buchstaben.insert(xy1);
//        for (int i = 0; i < str1.length(); i++) {
//            buchstaben = buchstaben.insert(str1.substring(i,i+1));
//        }
//        for (char c : str1.toCharArray()) {
//            if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
//                buchstaben = buchstaben.insert(c + "");
//            }
//        }
//        System.out.println(buchstaben);

//        Map<Character, Integer> cm = map();
//        for (char c : str.toCharArray()) {
//            if (c == '\n') c = '\\';
//            cm = cm.put(c, cm.contains(c) ? cm.get(c) + 1 : 1);
//        }
//
//        System.out.println(cm);
    }
}
