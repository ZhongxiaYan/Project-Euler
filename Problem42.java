import java.util.*;

public class Problem42 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = new int [31];
		int triangle[] = new int [466];
		for (int a = 1; a < 31; a++) {
			array[a] = a*(a+1)/2;
			triangle[array[a]] = array[a];
		}
		List<String> words = new ArrayList<String>();
		words.add("A"); words.add("ABILITY"); words.add("ABLE"); words.add("ABOUT"); words.add("ABOVE"); words.add("ABSENCE"); words.add("ABSOLUTELY"); words.add("ACADEMIC"); words.add("ACCEPT"); words.add("ACCESS"); words.add("ACCIDENT"); words.add("ACCOMPANY"); words.add("ACCORDING"); words.add("ACCOUNT"); words.add("ACHIEVE"); words.add("ACHIEVEMENT"); words.add("ACID"); words.add("ACQUIRE"); words.add("ACROSS"); words.add("ACT"); words.add("ACTION"); words.add("ACTIVE"); words.add("ACTIVITY"); words.add("ACTUAL"); words.add("ACTUALLY"); words.add("ADD"); words.add("ADDITION"); words.add("ADDITIONAL"); words.add("ADDRESS"); words.add("ADMINISTRATION"); words.add("ADMIT"); words.add("ADOPT"); words.add("ADULT"); words.add("ADVANCE"); words.add("ADVANTAGE"); words.add("ADVICE"); words.add("ADVISE"); words.add("AFFAIR"); words.add("AFFECT"); words.add("AFFORD"); words.add("AFRAID"); words.add("AFTER"); words.add("AFTERNOON"); words.add("AFTERWARDS"); words.add("AGAIN"); words.add("AGAINST"); words.add("AGE"); words.add("AGENCY"); words.add("AGENT"); words.add("AGO"); words.add("AGREE"); words.add("AGREEMENT"); words.add("AHEAD"); words.add("AID"); words.add("AIM"); words.add("AIR"); words.add("AIRCRAFT"); words.add("ALL"); words.add("ALLOW"); words.add("ALMOST"); words.add("ALONE"); words.add("ALONG"); words.add("ALREADY"); words.add("ALRIGHT"); words.add("ALSO"); words.add("ALTERNATIVE"); words.add("ALTHOUGH"); words.add("ALWAYS"); words.add("AMONG"); words.add("AMONGST"); words.add("AMOUNT"); words.add("AN"); words.add("ANALYSIS"); words.add("ANCIENT"); words.add("AND"); words.add("ANIMAL"); words.add("ANNOUNCE"); words.add("ANNUAL"); words.add("ANOTHER"); words.add("ANSWER"); words.add("ANY"); words.add("ANYBODY"); words.add("ANYONE"); words.add("ANYTHING"); words.add("ANYWAY"); words.add("APART"); words.add("APPARENT"); words.add("APPARENTLY"); words.add("APPEAL"); words.add("APPEAR"); words.add("APPEARANCE"); words.add("APPLICATION"); words.add("APPLY"); words.add("APPOINT"); words.add("APPOINTMENT"); words.add("APPROACH"); words.add("APPROPRIATE"); words.add("APPROVE"); words.add("AREA"); words.add("ARGUE"); words.add("ARGUMENT"); words.add("ARISE"); words.add("ARM"); words.add("ARMY"); words.add("AROUND"); words.add("ARRANGE"); words.add("ARRANGEMENT"); words.add("ARRIVE"); words.add("ART"); words.add("ARTICLE"); words.add("ARTIST"); words.add("AS"); words.add("ASK"); words.add("ASPECT"); words.add("ASSEMBLY"); words.add("ASSESS"); words.add("ASSESSMENT"); words.add("ASSET"); words.add("ASSOCIATE"); words.add("ASSOCIATION"); words.add("ASSUME"); words.add("ASSUMPTION"); words.add("AT"); words.add("ATMOSPHERE"); words.add("ATTACH"); words.add("ATTACK"); words.add("ATTEMPT"); words.add("ATTEND"); words.add("ATTENTION"); words.add("ATTITUDE"); words.add("ATTRACT"); words.add("ATTRACTIVE"); words.add("AUDIENCE"); words.add("AUTHOR"); words.add("AUTHORITY"); words.add("AVAILABLE"); words.add("AVERAGE"); words.add("AVOID"); words.add("AWARD"); words.add("AWARE"); words.add("AWAY"); words.add("AYE"); words.add("BABY"); words.add("BACK"); words.add("BACKGROUND"); words.add("BAD"); words.add("BAG"); words.add("BALANCE"); words.add("BALL"); words.add("BAND"); words.add("BANK"); words.add("BAR"); words.add("BASE"); words.add("BASIC"); words.add("BASIS"); words.add("BATTLE"); words.add("BE"); words.add("BEAR"); words.add("BEAT"); words.add("BEAUTIFUL"); words.add("BECAUSE"); words.add("BECOME"); words.add("BED"); words.add("BEDROOM"); words.add("BEFORE"); words.add("BEGIN"); words.add("BEGINNING"); words.add("BEHAVIOUR"); words.add("BEHIND"); words.add("BELIEF"); words.add("BELIEVE"); words.add("BELONG"); words.add("BELOW"); words.add("BENEATH"); words.add("BENEFIT"); words.add("BESIDE"); words.add("BEST"); words.add("BETTER"); words.add("BETWEEN"); words.add("BEYOND"); words.add("BIG"); words.add("BILL"); words.add("BIND"); words.add("BIRD"); words.add("BIRTH"); words.add("BIT"); words.add("BLACK"); words.add("BLOCK"); words.add("BLOOD"); words.add("BLOODY"); words.add("BLOW"); words.add("BLUE"); words.add("BOARD"); words.add("BOAT"); words.add("BODY"); words.add("BONE"); words.add("BOOK"); words.add("BORDER"); words.add("BOTH"); words.add("BOTTLE"); words.add("BOTTOM"); words.add("BOX"); words.add("BOY"); words.add("BRAIN"); words.add("BRANCH"); words.add("BREAK"); words.add("BREATH"); words.add("BRIDGE"); words.add("BRIEF"); words.add("BRIGHT"); words.add("BRING"); words.add("BROAD"); words.add("BROTHER"); words.add("BUDGET"); words.add("BUILD"); words.add("BUILDING"); words.add("BURN"); words.add("BUS"); words.add("BUSINESS"); words.add("BUSY"); words.add("BUT"); words.add("BUY"); words.add("BY"); words.add("CABINET"); words.add("CALL"); words.add("CAMPAIGN"); words.add("CAN"); words.add("CANDIDATE"); words.add("CAPABLE"); words.add("CAPACITY"); words.add("CAPITAL"); words.add("CAR"); words.add("CARD"); words.add("CARE"); words.add("CAREER"); words.add("CAREFUL"); words.add("CAREFULLY"); words.add("CARRY"); words.add("CASE"); words.add("CASH"); words.add("CAT"); words.add("CATCH"); words.add("CATEGORY"); words.add("CAUSE"); words.add("CELL"); words.add("CENTRAL"); words.add("CENTRE"); words.add("CENTURY"); words.add("CERTAIN"); words.add("CERTAINLY"); words.add("CHAIN"); words.add("CHAIR"); words.add("CHAIRMAN"); words.add("CHALLENGE"); words.add("CHANCE"); words.add("CHANGE"); words.add("CHANNEL"); words.add("CHAPTER"); words.add("CHARACTER"); words.add("CHARACTERISTIC"); words.add("CHARGE"); words.add("CHEAP"); words.add("CHECK"); words.add("CHEMICAL"); words.add("CHIEF"); words.add("CHILD"); words.add("CHOICE"); words.add("CHOOSE"); words.add("CHURCH"); words.add("CIRCLE"); words.add("CIRCUMSTANCE"); words.add("CITIZEN"); words.add("CITY"); words.add("CIVIL"); words.add("CLAIM"); words.add("CLASS"); words.add("CLEAN"); words.add("CLEAR"); words.add("CLEARLY"); words.add("CLIENT"); words.add("CLIMB"); words.add("CLOSE"); words.add("CLOSELY"); words.add("CLOTHES"); words.add("CLUB"); words.add("COAL"); words.add("CODE"); words.add("COFFEE"); words.add("COLD"); words.add("COLLEAGUE"); words.add("COLLECT"); words.add("COLLECTION"); words.add("COLLEGE"); words.add("COLOUR"); words.add("COMBINATION"); words.add("COMBINE"); words.add("COME"); words.add("COMMENT"); words.add("COMMERCIAL"); words.add("COMMISSION"); words.add("COMMIT"); words.add("COMMITMENT"); words.add("COMMITTEE"); words.add("COMMON"); words.add("COMMUNICATION"); words.add("COMMUNITY"); words.add("COMPANY"); words.add("COMPARE"); words.add("COMPARISON"); words.add("COMPETITION"); words.add("COMPLETE"); words.add("COMPLETELY"); words.add("COMPLEX"); words.add("COMPONENT"); words.add("COMPUTER"); words.add("CONCENTRATE"); words.add("CONCENTRATION"); words.add("CONCEPT"); words.add("CONCERN"); words.add("CONCERNED"); words.add("CONCLUDE"); words.add("CONCLUSION"); words.add("CONDITION"); words.add("CONDUCT"); words.add("CONFERENCE"); words.add("CONFIDENCE"); words.add("CONFIRM"); words.add("CONFLICT"); words.add("CONGRESS"); words.add("CONNECT"); words.add("CONNECTION"); words.add("CONSEQUENCE"); words.add("CONSERVATIVE"); words.add("CONSIDER"); words.add("CONSIDERABLE"); words.add("CONSIDERATION"); words.add("CONSIST"); words.add("CONSTANT"); words.add("CONSTRUCTION"); words.add("CONSUMER"); words.add("CONTACT"); words.add("CONTAIN"); words.add("CONTENT"); words.add("CONTEXT"); words.add("CONTINUE"); words.add("CONTRACT"); words.add("CONTRAST"); words.add("CONTRIBUTE"); words.add("CONTRIBUTION"); words.add("CONTROL"); words.add("CONVENTION"); words.add("CONVERSATION"); words.add("COPY"); words.add("CORNER"); words.add("CORPORATE"); words.add("CORRECT"); words.add("COS"); words.add("COST"); words.add("COULD"); words.add("COUNCIL"); words.add("COUNT"); words.add("COUNTRY"); words.add("COUNTY"); words.add("COUPLE"); words.add("COURSE"); words.add("COURT"); words.add("COVER"); words.add("CREATE"); words.add("CREATION"); words.add("CREDIT"); words.add("CRIME"); words.add("CRIMINAL"); words.add("CRISIS"); words.add("CRITERION"); words.add("CRITICAL"); words.add("CRITICISM"); words.add("CROSS"); words.add("CROWD"); words.add("CRY"); words.add("CULTURAL"); words.add("CULTURE"); words.add("CUP"); words.add("CURRENT"); words.add("CURRENTLY"); words.add("CURRICULUM"); words.add("CUSTOMER"); words.add("CUT"); words.add("DAMAGE"); words.add("DANGER"); words.add("DANGEROUS"); words.add("DARK"); words.add("DATA"); words.add("DATE"); words.add("DAUGHTER"); words.add("DAY"); words.add("DEAD"); words.add("DEAL"); words.add("DEATH"); words.add("DEBATE"); words.add("DEBT"); words.add("DECADE"); words.add("DECIDE"); words.add("DECISION"); words.add("DECLARE"); words.add("DEEP"); words.add("DEFENCE"); words.add("DEFENDANT"); words.add("DEFINE"); words.add("DEFINITION"); words.add("DEGREE"); words.add("DELIVER"); words.add("DEMAND"); words.add("DEMOCRATIC"); words.add("DEMONSTRATE"); words.add("DENY"); words.add("DEPARTMENT"); words.add("DEPEND"); words.add("DEPUTY"); words.add("DERIVE"); words.add("DESCRIBE"); words.add("DESCRIPTION"); words.add("DESIGN"); words.add("DESIRE"); words.add("DESK"); words.add("DESPITE"); words.add("DESTROY"); words.add("DETAIL"); words.add("DETAILED"); words.add("DETERMINE"); words.add("DEVELOP"); words.add("DEVELOPMENT"); words.add("DEVICE"); words.add("DIE"); words.add("DIFFERENCE"); words.add("DIFFERENT"); words.add("DIFFICULT"); words.add("DIFFICULTY"); words.add("DINNER"); words.add("DIRECT"); words.add("DIRECTION"); words.add("DIRECTLY"); words.add("DIRECTOR"); words.add("DISAPPEAR"); words.add("DISCIPLINE"); words.add("DISCOVER"); words.add("DISCUSS"); words.add("DISCUSSION"); words.add("DISEASE"); words.add("DISPLAY"); words.add("DISTANCE"); words.add("DISTINCTION"); words.add("DISTRIBUTION"); words.add("DISTRICT"); words.add("DIVIDE"); words.add("DIVISION"); words.add("DO"); words.add("DOCTOR"); words.add("DOCUMENT"); words.add("DOG"); words.add("DOMESTIC"); words.add("DOOR"); words.add("DOUBLE"); words.add("DOUBT"); words.add("DOWN"); words.add("DRAW"); words.add("DRAWING"); words.add("DREAM"); words.add("DRESS"); words.add("DRINK"); words.add("DRIVE"); words.add("DRIVER"); words.add("DROP"); words.add("DRUG"); words.add("DRY"); words.add("DUE"); words.add("DURING"); words.add("DUTY"); words.add("EACH"); words.add("EAR"); words.add("EARLY"); words.add("EARN"); words.add("EARTH"); words.add("EASILY"); words.add("EAST"); words.add("EASY"); words.add("EAT"); words.add("ECONOMIC"); words.add("ECONOMY"); words.add("EDGE"); words.add("EDITOR"); words.add("EDUCATION"); words.add("EDUCATIONAL"); words.add("EFFECT"); words.add("EFFECTIVE"); words.add("EFFECTIVELY"); words.add("EFFORT"); words.add("EGG"); words.add("EITHER"); words.add("ELDERLY"); words.add("ELECTION"); words.add("ELEMENT"); words.add("ELSE"); words.add("ELSEWHERE"); words.add("EMERGE"); words.add("EMPHASIS"); words.add("EMPLOY"); words.add("EMPLOYEE"); words.add("EMPLOYER"); words.add("EMPLOYMENT"); words.add("EMPTY"); words.add("ENABLE"); words.add("ENCOURAGE"); words.add("END"); words.add("ENEMY"); words.add("ENERGY"); words.add("ENGINE"); words.add("ENGINEERING"); words.add("ENJOY"); words.add("ENOUGH"); words.add("ENSURE"); words.add("ENTER"); words.add("ENTERPRISE"); words.add("ENTIRE"); words.add("ENTIRELY"); words.add("ENTITLE"); words.add("ENTRY"); words.add("ENVIRONMENT"); words.add("ENVIRONMENTAL"); words.add("EQUAL"); words.add("EQUALLY"); words.add("EQUIPMENT"); words.add("ERROR"); words.add("ESCAPE"); words.add("ESPECIALLY"); words.add("ESSENTIAL"); words.add("ESTABLISH"); words.add("ESTABLISHMENT"); words.add("ESTATE"); words.add("ESTIMATE"); words.add("EVEN"); words.add("EVENING"); words.add("EVENT"); words.add("EVENTUALLY"); words.add("EVER"); words.add("EVERY"); words.add("EVERYBODY"); words.add("EVERYONE"); words.add("EVERYTHING"); words.add("EVIDENCE"); words.add("EXACTLY"); words.add("EXAMINATION"); words.add("EXAMINE"); words.add("EXAMPLE"); words.add("EXCELLENT"); words.add("EXCEPT"); words.add("EXCHANGE"); words.add("EXECUTIVE"); words.add("EXERCISE"); words.add("EXHIBITION"); words.add("EXIST"); words.add("EXISTENCE"); words.add("EXISTING"); words.add("EXPECT"); words.add("EXPECTATION"); words.add("EXPENDITURE"); words.add("EXPENSE"); words.add("EXPENSIVE"); words.add("EXPERIENCE"); words.add("EXPERIMENT"); words.add("EXPERT"); words.add("EXPLAIN"); words.add("EXPLANATION"); words.add("EXPLORE"); words.add("EXPRESS"); words.add("EXPRESSION"); words.add("EXTEND"); words.add("EXTENT"); words.add("EXTERNAL"); words.add("EXTRA"); words.add("EXTREMELY"); words.add("EYE"); words.add("FACE"); words.add("FACILITY"); words.add("FACT"); words.add("FACTOR"); words.add("FACTORY"); words.add("FAIL"); words.add("FAILURE"); words.add("FAIR"); words.add("FAIRLY"); words.add("FAITH"); words.add("FALL"); words.add("FAMILIAR"); words.add("FAMILY"); words.add("FAMOUS"); words.add("FAR"); words.add("FARM"); words.add("FARMER"); words.add("FASHION"); words.add("FAST"); words.add("FATHER"); words.add("FAVOUR"); words.add("FEAR"); words.add("FEATURE"); words.add("FEE"); words.add("FEEL"); words.add("FEELING"); words.add("FEMALE"); words.add("FEW"); words.add("FIELD"); words.add("FIGHT"); words.add("FIGURE"); words.add("FILE"); words.add("FILL"); words.add("FILM"); words.add("FINAL"); words.add("FINALLY"); words.add("FINANCE"); words.add("FINANCIAL"); words.add("FIND"); words.add("FINDING"); words.add("FINE"); words.add("FINGER"); words.add("FINISH"); words.add("FIRE"); words.add("FIRM"); words.add("FIRST"); words.add("FISH"); words.add("FIT"); words.add("FIX"); words.add("FLAT"); words.add("FLIGHT"); words.add("FLOOR"); words.add("FLOW"); words.add("FLOWER"); words.add("FLY"); words.add("FOCUS"); words.add("FOLLOW"); words.add("FOLLOWING"); words.add("FOOD"); words.add("FOOT"); words.add("FOOTBALL"); words.add("FOR"); words.add("FORCE"); words.add("FOREIGN"); words.add("FOREST"); words.add("FORGET"); words.add("FORM"); words.add("FORMAL"); words.add("FORMER"); words.add("FORWARD"); words.add("FOUNDATION"); words.add("FREE"); words.add("FREEDOM"); words.add("FREQUENTLY"); words.add("FRESH"); words.add("FRIEND"); words.add("FROM"); words.add("FRONT"); words.add("FRUIT"); words.add("FUEL"); words.add("FULL"); words.add("FULLY"); words.add("FUNCTION"); words.add("FUND"); words.add("FUNNY"); words.add("FURTHER"); words.add("FUTURE"); words.add("GAIN"); words.add("GAME"); words.add("GARDEN"); words.add("GAS"); words.add("GATE"); words.add("GATHER"); words.add("GENERAL"); words.add("GENERALLY"); words.add("GENERATE"); words.add("GENERATION"); words.add("GENTLEMAN"); words.add("GET"); words.add("GIRL"); words.add("GIVE"); words.add("GLASS"); words.add("GO"); words.add("GOAL"); words.add("GOD"); words.add("GOLD"); words.add("GOOD"); words.add("GOVERNMENT"); words.add("GRANT"); words.add("GREAT"); words.add("GREEN"); words.add("GREY"); words.add("GROUND"); words.add("GROUP"); words.add("GROW"); words.add("GROWING"); words.add("GROWTH"); words.add("GUEST"); words.add("GUIDE"); words.add("GUN"); words.add("HAIR"); words.add("HALF"); words.add("HALL"); words.add("HAND"); words.add("HANDLE"); words.add("HANG"); words.add("HAPPEN"); words.add("HAPPY"); words.add("HARD"); words.add("HARDLY"); words.add("HATE"); words.add("HAVE"); words.add("HE"); words.add("HEAD"); words.add("HEALTH"); words.add("HEAR"); words.add("HEART"); words.add("HEAT"); words.add("HEAVY"); words.add("HELL"); words.add("HELP"); words.add("HENCE"); words.add("HER"); words.add("HERE"); words.add("HERSELF"); words.add("HIDE"); words.add("HIGH"); words.add("HIGHLY"); words.add("HILL"); words.add("HIM"); words.add("HIMSELF"); words.add("HIS"); words.add("HISTORICAL"); words.add("HISTORY"); words.add("HIT"); words.add("HOLD"); words.add("HOLE"); words.add("HOLIDAY"); words.add("HOME"); words.add("HOPE"); words.add("HORSE"); words.add("HOSPITAL"); words.add("HOT"); words.add("HOTEL"); words.add("HOUR"); words.add("HOUSE"); words.add("HOUSEHOLD"); words.add("HOUSING"); words.add("HOW"); words.add("HOWEVER"); words.add("HUGE"); words.add("HUMAN"); words.add("HURT"); words.add("HUSBAND"); words.add("I"); words.add("IDEA"); words.add("IDENTIFY"); words.add("IF"); words.add("IGNORE"); words.add("ILLUSTRATE"); words.add("IMAGE"); words.add("IMAGINE"); words.add("IMMEDIATE"); words.add("IMMEDIATELY"); words.add("IMPACT"); words.add("IMPLICATION"); words.add("IMPLY"); words.add("IMPORTANCE"); words.add("IMPORTANT"); words.add("IMPOSE"); words.add("IMPOSSIBLE"); words.add("IMPRESSION"); words.add("IMPROVE"); words.add("IMPROVEMENT"); words.add("IN"); words.add("INCIDENT"); words.add("INCLUDE"); words.add("INCLUDING"); words.add("INCOME"); words.add("INCREASE"); words.add("INCREASED"); words.add("INCREASINGLY"); words.add("INDEED"); words.add("INDEPENDENT"); words.add("INDEX"); words.add("INDICATE"); words.add("INDIVIDUAL"); words.add("INDUSTRIAL"); words.add("INDUSTRY"); words.add("INFLUENCE"); words.add("INFORM"); words.add("INFORMATION"); words.add("INITIAL"); words.add("INITIATIVE"); words.add("INJURY"); words.add("INSIDE"); words.add("INSIST"); words.add("INSTANCE"); words.add("INSTEAD"); words.add("INSTITUTE"); words.add("INSTITUTION"); words.add("INSTRUCTION"); words.add("INSTRUMENT"); words.add("INSURANCE"); words.add("INTEND"); words.add("INTENTION"); words.add("INTEREST"); words.add("INTERESTED"); words.add("INTERESTING"); words.add("INTERNAL"); words.add("INTERNATIONAL"); words.add("INTERPRETATION"); words.add("INTERVIEW"); words.add("INTO"); words.add("INTRODUCE"); words.add("INTRODUCTION"); words.add("INVESTIGATE"); words.add("INVESTIGATION"); words.add("INVESTMENT"); words.add("INVITE"); words.add("INVOLVE"); words.add("IRON"); words.add("IS"); words.add("ISLAND"); words.add("ISSUE"); words.add("IT"); words.add("ITEM"); words.add("ITS"); words.add("ITSELF"); words.add("JOB"); words.add("JOIN"); words.add("JOINT"); words.add("JOURNEY"); words.add("JUDGE"); words.add("JUMP"); words.add("JUST"); words.add("JUSTICE"); words.add("KEEP"); words.add("KEY"); words.add("KID"); words.add("KILL"); words.add("KIND"); words.add("KING"); words.add("KITCHEN"); words.add("KNEE"); words.add("KNOW"); words.add("KNOWLEDGE"); words.add("LABOUR"); words.add("LACK"); words.add("LADY"); words.add("LAND"); words.add("LANGUAGE"); words.add("LARGE"); words.add("LARGELY"); words.add("LAST"); words.add("LATE"); words.add("LATER"); words.add("LATTER"); words.add("LAUGH"); words.add("LAUNCH"); words.add("LAW"); words.add("LAWYER"); words.add("LAY"); words.add("LEAD"); words.add("LEADER"); words.add("LEADERSHIP"); words.add("LEADING"); words.add("LEAF"); words.add("LEAGUE"); words.add("LEAN"); words.add("LEARN"); words.add("LEAST"); words.add("LEAVE"); words.add("LEFT"); words.add("LEG"); words.add("LEGAL"); words.add("LEGISLATION"); words.add("LENGTH"); words.add("LESS"); words.add("LET"); words.add("LETTER"); words.add("LEVEL"); words.add("LIABILITY"); words.add("LIBERAL"); words.add("LIBRARY"); words.add("LIE"); words.add("LIFE"); words.add("LIFT"); words.add("LIGHT"); words.add("LIKE"); words.add("LIKELY"); words.add("LIMIT"); words.add("LIMITED"); words.add("LINE"); words.add("LINK"); words.add("LIP"); words.add("LIST"); words.add("LISTEN"); words.add("LITERATURE"); words.add("LITTLE"); words.add("LIVE"); words.add("LIVING"); words.add("LOAN"); words.add("LOCAL"); words.add("LOCATION"); words.add("LONG"); words.add("LOOK"); words.add("LORD"); words.add("LOSE"); words.add("LOSS"); words.add("LOT"); words.add("LOVE"); words.add("LOVELY"); words.add("LOW"); words.add("LUNCH"); words.add("MACHINE"); words.add("MAGAZINE"); words.add("MAIN"); words.add("MAINLY"); words.add("MAINTAIN"); words.add("MAJOR"); words.add("MAJORITY"); words.add("MAKE"); words.add("MALE"); words.add("MAN"); words.add("MANAGE"); words.add("MANAGEMENT"); words.add("MANAGER"); words.add("MANNER"); words.add("MANY"); words.add("MAP"); words.add("MARK"); words.add("MARKET"); words.add("MARRIAGE"); words.add("MARRIED"); words.add("MARRY"); words.add("MASS"); words.add("MASTER"); words.add("MATCH"); words.add("MATERIAL"); words.add("MATTER"); words.add("MAY"); words.add("MAYBE"); words.add("ME"); words.add("MEAL"); words.add("MEAN"); words.add("MEANING"); words.add("MEANS"); words.add("MEANWHILE"); words.add("MEASURE"); words.add("MECHANISM"); words.add("MEDIA"); words.add("MEDICAL"); words.add("MEET"); words.add("MEETING"); words.add("MEMBER"); words.add("MEMBERSHIP"); words.add("MEMORY"); words.add("MENTAL"); words.add("MENTION"); words.add("MERELY"); words.add("MESSAGE"); words.add("METAL"); words.add("METHOD"); words.add("MIDDLE"); words.add("MIGHT"); words.add("MILE"); words.add("MILITARY"); words.add("MILK"); words.add("MIND"); words.add("MINE"); words.add("MINISTER"); words.add("MINISTRY"); words.add("MINUTE"); words.add("MISS"); words.add("MISTAKE"); words.add("MODEL"); words.add("MODERN"); words.add("MODULE"); words.add("MOMENT"); words.add("MONEY"); words.add("MONTH"); words.add("MORE"); words.add("MORNING"); words.add("MOST"); words.add("MOTHER"); words.add("MOTION"); words.add("MOTOR"); words.add("MOUNTAIN"); words.add("MOUTH"); words.add("MOVE"); words.add("MOVEMENT"); words.add("MUCH"); words.add("MURDER"); words.add("MUSEUM"); words.add("MUSIC"); words.add("MUST"); words.add("MY"); words.add("MYSELF"); words.add("NAME"); words.add("NARROW"); words.add("NATION"); words.add("NATIONAL"); words.add("NATURAL"); words.add("NATURE"); words.add("NEAR"); words.add("NEARLY"); words.add("NECESSARILY"); words.add("NECESSARY"); words.add("NECK"); words.add("NEED"); words.add("NEGOTIATION"); words.add("NEIGHBOUR"); words.add("NEITHER"); words.add("NETWORK"); words.add("NEVER"); words.add("NEVERTHELESS"); words.add("NEW"); words.add("NEWS"); words.add("NEWSPAPER"); words.add("NEXT"); words.add("NICE"); words.add("NIGHT"); words.add("NO"); words.add("NOBODY"); words.add("NOD"); words.add("NOISE"); words.add("NONE"); words.add("NOR"); words.add("NORMAL"); words.add("NORMALLY"); words.add("NORTH"); words.add("NORTHERN"); words.add("NOSE"); words.add("NOT"); words.add("NOTE"); words.add("NOTHING"); words.add("NOTICE"); words.add("NOTION"); words.add("NOW"); words.add("NUCLEAR"); words.add("NUMBER"); words.add("NURSE"); words.add("OBJECT"); words.add("OBJECTIVE"); words.add("OBSERVATION"); words.add("OBSERVE"); words.add("OBTAIN"); words.add("OBVIOUS"); words.add("OBVIOUSLY"); words.add("OCCASION"); words.add("OCCUR"); words.add("ODD"); words.add("OF"); words.add("OFF"); words.add("OFFENCE"); words.add("OFFER"); words.add("OFFICE"); words.add("OFFICER"); words.add("OFFICIAL"); words.add("OFTEN"); words.add("OIL"); words.add("OKAY"); words.add("OLD"); words.add("ON"); words.add("ONCE"); words.add("ONE"); words.add("ONLY"); words.add("ONTO"); words.add("OPEN"); words.add("OPERATE"); words.add("OPERATION"); words.add("OPINION"); words.add("OPPORTUNITY"); words.add("OPPOSITION"); words.add("OPTION"); words.add("OR"); words.add("ORDER"); words.add("ORDINARY"); words.add("ORGANISATION"); words.add("ORGANISE"); words.add("ORGANIZATION"); words.add("ORIGIN"); words.add("ORIGINAL"); words.add("OTHER"); words.add("OTHERWISE"); words.add("OUGHT"); words.add("OUR"); words.add("OURSELVES"); words.add("OUT"); words.add("OUTCOME"); words.add("OUTPUT"); words.add("OUTSIDE"); words.add("OVER"); words.add("OVERALL"); words.add("OWN"); words.add("OWNER"); words.add("PACKAGE"); words.add("PAGE"); words.add("PAIN"); words.add("PAINT"); words.add("PAINTING"); words.add("PAIR"); words.add("PANEL"); words.add("PAPER"); words.add("PARENT"); words.add("PARK"); words.add("PARLIAMENT"); words.add("PART"); words.add("PARTICULAR"); words.add("PARTICULARLY"); words.add("PARTLY"); words.add("PARTNER"); words.add("PARTY"); words.add("PASS"); words.add("PASSAGE"); words.add("PAST"); words.add("PATH"); words.add("PATIENT"); words.add("PATTERN"); words.add("PAY"); words.add("PAYMENT"); words.add("PEACE"); words.add("PENSION"); words.add("PEOPLE"); words.add("PER"); words.add("PERCENT"); words.add("PERFECT"); words.add("PERFORM"); words.add("PERFORMANCE"); words.add("PERHAPS"); words.add("PERIOD"); words.add("PERMANENT"); words.add("PERSON"); words.add("PERSONAL"); words.add("PERSUADE"); words.add("PHASE"); words.add("PHONE"); words.add("PHOTOGRAPH"); words.add("PHYSICAL"); words.add("PICK"); words.add("PICTURE"); words.add("PIECE"); words.add("PLACE"); words.add("PLAN"); words.add("PLANNING"); words.add("PLANT"); words.add("PLASTIC"); words.add("PLATE"); words.add("PLAY"); words.add("PLAYER"); words.add("PLEASE"); words.add("PLEASURE"); words.add("PLENTY"); words.add("PLUS"); words.add("POCKET"); words.add("POINT"); words.add("POLICE"); words.add("POLICY"); words.add("POLITICAL"); words.add("POLITICS"); words.add("POOL"); words.add("POOR"); words.add("POPULAR"); words.add("POPULATION"); words.add("POSITION"); words.add("POSITIVE"); words.add("POSSIBILITY"); words.add("POSSIBLE"); words.add("POSSIBLY"); words.add("POST"); words.add("POTENTIAL"); words.add("POUND"); words.add("POWER"); words.add("POWERFUL"); words.add("PRACTICAL"); words.add("PRACTICE"); words.add("PREFER"); words.add("PREPARE"); words.add("PRESENCE"); words.add("PRESENT"); words.add("PRESIDENT"); words.add("PRESS"); words.add("PRESSURE"); words.add("PRETTY"); words.add("PREVENT"); words.add("PREVIOUS"); words.add("PREVIOUSLY"); words.add("PRICE"); words.add("PRIMARY"); words.add("PRIME"); words.add("PRINCIPLE"); words.add("PRIORITY"); words.add("PRISON"); words.add("PRISONER"); words.add("PRIVATE"); words.add("PROBABLY"); words.add("PROBLEM"); words.add("PROCEDURE"); words.add("PROCESS"); words.add("PRODUCE"); words.add("PRODUCT"); words.add("PRODUCTION"); words.add("PROFESSIONAL"); words.add("PROFIT"); words.add("PROGRAM"); words.add("PROGRAMME"); words.add("PROGRESS"); words.add("PROJECT"); words.add("PROMISE"); words.add("PROMOTE"); words.add("PROPER"); words.add("PROPERLY"); words.add("PROPERTY"); words.add("PROPORTION"); words.add("PROPOSE"); words.add("PROPOSAL"); words.add("PROSPECT"); words.add("PROTECT"); words.add("PROTECTION"); words.add("PROVE"); words.add("PROVIDE"); words.add("PROVIDED"); words.add("PROVISION"); words.add("PUB"); words.add("PUBLIC"); words.add("PUBLICATION"); words.add("PUBLISH"); words.add("PULL"); words.add("PUPIL"); words.add("PURPOSE"); words.add("PUSH"); words.add("PUT"); words.add("QUALITY"); words.add("QUARTER"); words.add("QUESTION"); words.add("QUICK"); words.add("QUICKLY"); words.add("QUIET"); words.add("QUITE"); words.add("RACE"); words.add("RADIO"); words.add("RAILWAY"); words.add("RAIN"); words.add("RAISE"); words.add("RANGE"); words.add("RAPIDLY"); words.add("RARE"); words.add("RATE"); words.add("RATHER"); words.add("REACH"); words.add("REACTION"); words.add("READ"); words.add("READER"); words.add("READING"); words.add("READY"); words.add("REAL"); words.add("REALISE"); words.add("REALITY"); words.add("REALIZE"); words.add("REALLY"); words.add("REASON"); words.add("REASONABLE"); words.add("RECALL"); words.add("RECEIVE"); words.add("RECENT"); words.add("RECENTLY"); words.add("RECOGNISE"); words.add("RECOGNITION"); words.add("RECOGNIZE"); words.add("RECOMMEND"); words.add("RECORD"); words.add("RECOVER"); words.add("RED"); words.add("REDUCE"); words.add("REDUCTION"); words.add("REFER"); words.add("REFERENCE"); words.add("REFLECT"); words.add("REFORM"); words.add("REFUSE"); words.add("REGARD"); words.add("REGION"); words.add("REGIONAL"); words.add("REGULAR"); words.add("REGULATION"); words.add("REJECT"); words.add("RELATE"); words.add("RELATION"); words.add("RELATIONSHIP"); words.add("RELATIVE"); words.add("RELATIVELY"); words.add("RELEASE"); words.add("RELEVANT"); words.add("RELIEF"); words.add("RELIGION"); words.add("RELIGIOUS"); words.add("RELY"); words.add("REMAIN"); words.add("REMEMBER"); words.add("REMIND"); words.add("REMOVE"); words.add("REPEAT"); words.add("REPLACE"); words.add("REPLY"); words.add("REPORT"); words.add("REPRESENT"); words.add("REPRESENTATION"); words.add("REPRESENTATIVE"); words.add("REQUEST"); words.add("REQUIRE"); words.add("REQUIREMENT"); words.add("RESEARCH"); words.add("RESOURCE"); words.add("RESPECT"); words.add("RESPOND"); words.add("RESPONSE"); words.add("RESPONSIBILITY"); words.add("RESPONSIBLE"); words.add("REST"); words.add("RESTAURANT"); words.add("RESULT"); words.add("RETAIN"); words.add("RETURN"); words.add("REVEAL"); words.add("REVENUE"); words.add("REVIEW"); words.add("REVOLUTION"); words.add("RICH"); words.add("RIDE"); words.add("RIGHT"); words.add("RING"); words.add("RISE"); words.add("RISK"); words.add("RIVER"); words.add("ROAD"); words.add("ROCK"); words.add("ROLE"); words.add("ROLL"); words.add("ROOF"); words.add("ROOM"); words.add("ROUND"); words.add("ROUTE"); words.add("ROW"); words.add("ROYAL"); words.add("RULE"); words.add("RUN"); words.add("RURAL"); words.add("SAFE"); words.add("SAFETY"); words.add("SALE"); words.add("SAME"); words.add("SAMPLE"); words.add("SATISFY"); words.add("SAVE"); words.add("SAY"); words.add("SCALE"); words.add("SCENE"); words.add("SCHEME"); words.add("SCHOOL"); words.add("SCIENCE"); words.add("SCIENTIFIC"); words.add("SCIENTIST"); words.add("SCORE"); words.add("SCREEN"); words.add("SEA"); words.add("SEARCH"); words.add("SEASON"); words.add("SEAT"); words.add("SECOND"); words.add("SECONDARY"); words.add("SECRETARY"); words.add("SECTION"); words.add("SECTOR"); words.add("SECURE"); words.add("SECURITY"); words.add("SEE"); words.add("SEEK"); words.add("SEEM"); words.add("SELECT"); words.add("SELECTION"); words.add("SELL"); words.add("SEND"); words.add("SENIOR"); words.add("SENSE"); words.add("SENTENCE"); words.add("SEPARATE"); words.add("SEQUENCE"); words.add("SERIES"); words.add("SERIOUS"); words.add("SERIOUSLY"); words.add("SERVANT"); words.add("SERVE"); words.add("SERVICE"); words.add("SESSION"); words.add("SET"); words.add("SETTLE"); words.add("SETTLEMENT"); words.add("SEVERAL"); words.add("SEVERE"); words.add("SEX"); words.add("SEXUAL"); words.add("SHAKE"); words.add("SHALL"); words.add("SHAPE"); words.add("SHARE"); words.add("SHE"); words.add("SHEET"); words.add("SHIP"); words.add("SHOE"); words.add("SHOOT"); words.add("SHOP"); words.add("SHORT"); words.add("SHOT"); words.add("SHOULD"); words.add("SHOULDER"); words.add("SHOUT"); words.add("SHOW"); words.add("SHUT"); words.add("SIDE"); words.add("SIGHT"); words.add("SIGN"); words.add("SIGNAL"); words.add("SIGNIFICANCE"); words.add("SIGNIFICANT"); words.add("SILENCE"); words.add("SIMILAR"); words.add("SIMPLE"); words.add("SIMPLY"); words.add("SINCE"); words.add("SING"); words.add("SINGLE"); words.add("SIR"); words.add("SISTER"); words.add("SIT"); words.add("SITE"); words.add("SITUATION"); words.add("SIZE"); words.add("SKILL"); words.add("SKIN"); words.add("SKY"); words.add("SLEEP"); words.add("SLIGHTLY"); words.add("SLIP"); words.add("SLOW"); words.add("SLOWLY"); words.add("SMALL"); words.add("SMILE"); words.add("SO"); words.add("SOCIAL"); words.add("SOCIETY"); words.add("SOFT"); words.add("SOFTWARE"); words.add("SOIL"); words.add("SOLDIER"); words.add("SOLICITOR"); words.add("SOLUTION"); words.add("SOME"); words.add("SOMEBODY"); words.add("SOMEONE"); words.add("SOMETHING"); words.add("SOMETIMES"); words.add("SOMEWHAT"); words.add("SOMEWHERE"); words.add("SON"); words.add("SONG"); words.add("SOON"); words.add("SORRY"); words.add("SORT"); words.add("SOUND"); words.add("SOURCE"); words.add("SOUTH"); words.add("SOUTHERN"); words.add("SPACE"); words.add("SPEAK"); words.add("SPEAKER"); words.add("SPECIAL"); words.add("SPECIES"); words.add("SPECIFIC"); words.add("SPEECH"); words.add("SPEED"); words.add("SPEND"); words.add("SPIRIT"); words.add("SPORT"); words.add("SPOT"); words.add("SPREAD"); words.add("SPRING"); words.add("STAFF"); words.add("STAGE"); words.add("STAND"); words.add("STANDARD"); words.add("STAR"); words.add("START"); words.add("STATE"); words.add("STATEMENT"); words.add("STATION"); words.add("STATUS"); words.add("STAY"); words.add("STEAL"); words.add("STEP"); words.add("STICK"); words.add("STILL"); words.add("STOCK"); words.add("STONE"); words.add("STOP"); words.add("STORE"); words.add("STORY"); words.add("STRAIGHT"); words.add("STRANGE"); words.add("STRATEGY"); words.add("STREET"); words.add("STRENGTH"); words.add("STRIKE"); words.add("STRONG"); words.add("STRONGLY"); words.add("STRUCTURE"); words.add("STUDENT"); words.add("STUDIO"); words.add("STUDY"); words.add("STUFF"); words.add("STYLE"); words.add("SUBJECT"); words.add("SUBSTANTIAL"); words.add("SUCCEED"); words.add("SUCCESS"); words.add("SUCCESSFUL"); words.add("SUCH"); words.add("SUDDENLY"); words.add("SUFFER"); words.add("SUFFICIENT"); words.add("SUGGEST"); words.add("SUGGESTION"); words.add("SUITABLE"); words.add("SUM"); words.add("SUMMER"); words.add("SUN"); words.add("SUPPLY"); words.add("SUPPORT"); words.add("SUPPOSE"); words.add("SURE"); words.add("SURELY"); words.add("SURFACE"); words.add("SURPRISE"); words.add("SURROUND"); words.add("SURVEY"); words.add("SURVIVE"); words.add("SWITCH"); words.add("SYSTEM"); words.add("TABLE"); words.add("TAKE"); words.add("TALK"); words.add("TALL"); words.add("TAPE"); words.add("TARGET"); words.add("TASK"); words.add("TAX"); words.add("TEA"); words.add("TEACH"); words.add("TEACHER"); words.add("TEACHING"); words.add("TEAM"); words.add("TEAR"); words.add("TECHNICAL"); words.add("TECHNIQUE"); words.add("TECHNOLOGY"); words.add("TELEPHONE"); words.add("TELEVISION"); words.add("TELL"); words.add("TEMPERATURE"); words.add("TEND"); words.add("TERM"); words.add("TERMS"); words.add("TERRIBLE"); words.add("TEST"); words.add("TEXT"); words.add("THAN"); words.add("THANK"); words.add("THANKS"); words.add("THAT"); words.add("THE"); words.add("THEATRE"); words.add("THEIR"); words.add("THEM"); words.add("THEME"); words.add("THEMSELVES"); words.add("THEN"); words.add("THEORY"); words.add("THERE"); words.add("THEREFORE"); words.add("THESE"); words.add("THEY"); words.add("THIN"); words.add("THING"); words.add("THINK"); words.add("THIS"); words.add("THOSE"); words.add("THOUGH"); words.add("THOUGHT"); words.add("THREAT"); words.add("THREATEN"); words.add("THROUGH"); words.add("THROUGHOUT"); words.add("THROW"); words.add("THUS"); words.add("TICKET"); words.add("TIME"); words.add("TINY"); words.add("TITLE"); words.add("TO"); words.add("TODAY"); words.add("TOGETHER"); words.add("TOMORROW"); words.add("TONE"); words.add("TONIGHT"); words.add("TOO"); words.add("TOOL"); words.add("TOOTH"); words.add("TOP"); words.add("TOTAL"); words.add("TOTALLY"); words.add("TOUCH"); words.add("TOUR"); words.add("TOWARDS"); words.add("TOWN"); words.add("TRACK"); words.add("TRADE"); words.add("TRADITION"); words.add("TRADITIONAL"); words.add("TRAFFIC"); words.add("TRAIN"); words.add("TRAINING"); words.add("TRANSFER"); words.add("TRANSPORT"); words.add("TRAVEL"); words.add("TREAT"); words.add("TREATMENT"); words.add("TREATY"); words.add("TREE"); words.add("TREND"); words.add("TRIAL"); words.add("TRIP"); words.add("TROOP"); words.add("TROUBLE"); words.add("TRUE"); words.add("TRUST"); words.add("TRUTH"); words.add("TRY"); words.add("TURN"); words.add("TWICE"); words.add("TYPE"); words.add("TYPICAL"); words.add("UNABLE"); words.add("UNDER"); words.add("UNDERSTAND"); words.add("UNDERSTANDING"); words.add("UNDERTAKE"); words.add("UNEMPLOYMENT"); words.add("UNFORTUNATELY"); words.add("UNION"); words.add("UNIT"); words.add("UNITED"); words.add("UNIVERSITY"); words.add("UNLESS"); words.add("UNLIKELY"); words.add("UNTIL"); words.add("UP"); words.add("UPON"); words.add("UPPER"); words.add("URBAN"); words.add("US"); words.add("USE"); words.add("USED"); words.add("USEFUL"); words.add("USER"); words.add("USUAL"); words.add("USUALLY"); words.add("VALUE"); words.add("VARIATION"); words.add("VARIETY"); words.add("VARIOUS"); words.add("VARY"); words.add("VAST"); words.add("VEHICLE"); words.add("VERSION"); words.add("VERY"); words.add("VIA"); words.add("VICTIM"); words.add("VICTORY"); words.add("VIDEO"); words.add("VIEW"); words.add("VILLAGE"); words.add("VIOLENCE"); words.add("VISION"); words.add("VISIT"); words.add("VISITOR"); words.add("VITAL"); words.add("VOICE"); words.add("VOLUME"); words.add("VOTE"); words.add("WAGE"); words.add("WAIT"); words.add("WALK"); words.add("WALL"); words.add("WANT"); words.add("WAR"); words.add("WARM"); words.add("WARN"); words.add("WASH"); words.add("WATCH"); words.add("WATER"); words.add("WAVE"); words.add("WAY"); words.add("WE"); words.add("WEAK"); words.add("WEAPON"); words.add("WEAR"); words.add("WEATHER"); words.add("WEEK"); words.add("WEEKEND"); words.add("WEIGHT"); words.add("WELCOME"); words.add("WELFARE"); words.add("WELL"); words.add("WEST"); words.add("WESTERN"); words.add("WHAT"); words.add("WHATEVER"); words.add("WHEN"); words.add("WHERE"); words.add("WHEREAS"); words.add("WHETHER"); words.add("WHICH"); words.add("WHILE"); words.add("WHILST"); words.add("WHITE"); words.add("WHO"); words.add("WHOLE"); words.add("WHOM"); words.add("WHOSE"); words.add("WHY"); words.add("WIDE"); words.add("WIDELY"); words.add("WIFE"); words.add("WILD"); words.add("WILL"); words.add("WIN"); words.add("WIND"); words.add("WINDOW"); words.add("WINE"); words.add("WING"); words.add("WINNER"); words.add("WINTER"); words.add("WISH"); words.add("WITH"); words.add("WITHDRAW"); words.add("WITHIN"); words.add("WITHOUT"); words.add("WOMAN"); words.add("WONDER"); words.add("WONDERFUL"); words.add("WOOD"); words.add("WORD"); words.add("WORK"); words.add("WORKER"); words.add("WORKING"); words.add("WORKS"); words.add("WORLD"); words.add("WORRY"); words.add("WORTH"); words.add("WOULD"); words.add("WRITE"); words.add("WRITER"); words.add("WRITING"); words.add("WRONG"); words.add("YARD"); words.add("YEAH"); words.add("YEAR"); words.add("YES"); words.add("YESTERDAY"); words.add("YET"); words.add("YOU"); words.add("YOUNG"); words.add("YOUR"); words.add("YOURSELF"); words.add("YOUTH");
		int i = 0;
		int counter = 0;
		while (i < 1786) {
			String a = words.get(i);
			char letters[] = a.toCharArray();
			int j = 0;
			int sum = 0;
			while (j < a.length()) {
				sum = sum + (int)letters[j] - 64;
				j++;
			}
			if (triangle[sum] == sum) {
				counter++;
			}
			i++;
		}
		System.out.println(counter);
	}

}