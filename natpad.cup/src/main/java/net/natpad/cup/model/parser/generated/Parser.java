/* generated by natpad.cup Wed Mar 23 16:40:51 CET 2016 */
package net.natpad.cup.model.parser.generated;

import java.util.Hashtable;
import net.natpad.cup.FatalCupException;
import net.natpad.cup.export.java.Emit;
import net.natpad.cup.model.bnf.ActionPart;
import net.natpad.cup.model.bnf.BnfModel;
import net.natpad.cup.model.bnf.NonTerminal;
import net.natpad.cup.model.bnf.Production;
import net.natpad.cup.model.bnf.ProductionPart;
import net.natpad.cup.model.bnf.Symbol;
import net.natpad.cup.model.bnf.SymbolPart;
import net.natpad.cup.model.bnf.Terminal;
import net.natpad.cup.model.parser.NewLexer;
import net.natpad.cup.model.parser.ParserHelper;
import net.natpad.cup.model.parser.generated.runtime.LrParser;
import net.natpad.cup.model.parser.generated.runtime.LrParserContext;
import net.natpad.cup.model.parser.generated.runtime.LrSymbol;
import net.natpad.cup.state.Assoc;

public class Parser extends LrParser {

	public Parser() {}

	/** Production table. */
	protected static final short productionTable[][] = 
	new short[][] {
		new short[] { 0, 2 },
		new short[] { 1, 8 },
		new short[] { 43, 0 },
		new short[] { 1, 5 },
		new short[] { 2, 4 },
		new short[] { 44, 0 },
		new short[] { 2, 1 },
		new short[] { 3, 2 },
		new short[] { 3, 1 },
		new short[] { 14, 4 },
		new short[] { 45, 0 },
		new short[] { 6, 1 },
		new short[] { 6, 1 },
		new short[] { 6, 1 },
		new short[] { 6, 1 },
		new short[] { 5, 0 },
		new short[] { 5, 2 },
		new short[] { 4, 4 },
		new short[] { 9, 4 },
		new short[] { 16, 4 },
		new short[] { 17, 4 },
		new short[] { 10, 2 },
		new short[] { 10, 1 },
		new short[] { 18, 3 },
		new short[] { 18, 2 },
		new short[] { 18, 3 },
		new short[] { 18, 2 },
		new short[] { 18, 4 },
		new short[] { 46, 0 },
		new short[] { 18, 4 },
		new short[] { 47, 0 },
		new short[] { 34, 3 },
		new short[] { 48, 0 },
		new short[] { 35, 3 },
		new short[] { 49, 0 },
		new short[] { 20, 3 },
		new short[] { 20, 1 },
		new short[] { 21, 3 },
		new short[] { 21, 1 },
		new short[] { 30, 1 },
		new short[] { 30, 1 },
		new short[] { 33, 2 },
		new short[] { 33, 1 },
		new short[] { 31, 5 },
		new short[] { 50, 0 },
		new short[] { 31, 5 },
		new short[] { 51, 0 },
		new short[] { 31, 5 },
		new short[] { 52, 0 },
		new short[] { 32, 3 },
		new short[] { 32, 1 },
		new short[] { 40, 1 },
		new short[] { 41, 1 },
		new short[] { 11, 5 },
		new short[] { 53, 0 },
		new short[] { 11, 1 },
		new short[] { 12, 2 },
		new short[] { 12, 1 },
		new short[] { 22, 5 },
		new short[] { 54, 0 },
		new short[] { 22, 3 },
		new short[] { 55, 0 },
		new short[] { 27, 3 },
		new short[] { 27, 1 },
		new short[] { 28, 3 },
		new short[] { 28, 1 },
		new short[] { 23, 2 },
		new short[] { 23, 1 },
		new short[] { 24, 2 },
		new short[] { 24, 1 },
		new short[] { 39, 2 },
		new short[] { 39, 1 },
		new short[] { 13, 3 },
		new short[] { 13, 1 },
		new short[] { 15, 3 },
		new short[] { 15, 1 },
		new short[] { 19, 1 },
		new short[] { 19, 3 },
		new short[] { 25, 1 },
		new short[] { 26, 1 },
		new short[] { 36, 1 },
		new short[] { 36, 1 },
		new short[] { 37, 1 },
		new short[] { 37, 1 },
		new short[] { 38, 1 },
		new short[] { 42, 1 },
		new short[] { 42, 1 },
		new short[] { 42, 1 },
		new short[] { 42, 1 },
		new short[] { 42, 1 },
		new short[] { 42, 1 },
		new short[] { 42, 1 },
		new short[] { 42, 1 },
		new short[] { 42, 1 },
		new short[] { 42, 1 },
		new short[] { 42, 1 },
		new short[] { 42, 1 },
		new short[] { 42, 1 },
		new short[] { 42, 1 },
		new short[] { 42, 1 },
		new short[] { 42, 1 },
		new short[] { 8, 2 },
		new short[] { 8, 1 },
		new short[] { 7, 0 },
		new short[] { 7, 1 },
		new short[] { 29, 0 }
 };
	/** Access to production table. */
	public short[][] getProductionTable() {
		return productionTable;
	}

	/** Parse-action table. */
	protected static final short[][] actionTable = 
	new short[][] {
		new short[] { 1, 3, 2, -3, 3, -3, 5, -3, 6, -3, 7, -3, 8, -3, 9, -3, 10, -3, 27, -3, -1, 0 },
		new short[] { 0, 166, -1, 0 },
		new short[] { 7, 17, 8, 16, 27, 13, -1, 0 },
		new short[] { 2, 5, 3, -106, 5, -106, 6, -106, 7, -106, 8, -106, 9, -106, 10, -106, 27, -106, -1, 0 },
		new short[] { 1, 68, 4, 83, 5, 81, 6, 78, 7, 72, 8, 70, 9, 79, 10, 74, 11, 82, 12, 75, 20, 80, 21, 73, 22, 76, 23, 69, 27, 67, 28, 77, -1, 0 },
		new short[] { 3, -7, 5, -7, 6, -7, 7, -7, 8, -7, 9, -7, 10, -7, 27, -7, -1, 0 },
		new short[] { 3, -106, 5, -106, 6, -106, 7, -106, 8, -106, 9, -106, 10, -106, 27, -106, -1, 0 },
		new short[] { 3, 10, 5, -16, 6, -16, 7, -16, 8, -16, 9, -16, 10, -16, 27, -16, -1, 0 },
		new short[] { 3, -9, 5, -9, 6, -9, 7, -9, 8, -9, 9, -9, 10, -9, 27, -9, -1, 0 },
		new short[] { 1, 68, 4, 83, 5, 81, 6, 78, 7, 72, 8, 70, 9, 79, 10, 74, 11, 82, 12, 75, 20, 80, 21, 73, 22, 76, 23, 69, 27, 67, 28, 77, -1, 0 },
		new short[] { 5, 25, 6, 22, 7, 17, 8, 16, 9, 23, 10, 19, 27, 13, -1, 0 },
		new short[] { 3, -8, 5, -8, 6, -8, 7, -8, 8, -8, 9, -8, 10, -8, 27, -8, -1, 0 },
		new short[] { 1, -103, 4, -103, 5, -103, 6, -103, 7, -103, 8, -103, 9, -103, 10, -103, 11, -103, 12, -103, 20, -103, 21, -103, 22, -103, 23, -103, 27, -103, 28, -103, -1, 0 },
		new short[] { 1, -23, 7, -23, 8, -23, 12, -23, 20, -23, 27, -23, 28, -23, -1, 0 },
		new short[] { 5, -13, 6, -13, 7, -13, 8, -13, 9, -13, 10, -13, 27, -13, -1, 0 },
		new short[] { 7, 152, -1, 0 },
		new short[] { 1, 139, 4, 83, 5, 81, 6, 78, 7, 72, 8, 70, 9, 79, 10, 74, 11, 82, 12, 75, 20, 80, 21, 73, 22, 76, 23, 69, 27, 67, 28, 143, -1, 0 },
		new short[] { 5, -15, 6, -15, 7, -15, 8, -15, 9, -15, 10, -15, 27, -15, -1, 0 },
		new short[] { 11, 135, -1, 0 },
		new short[] { 5, -12, 6, -12, 7, -12, 8, -12, 9, -12, 10, -12, 27, -12, -1, 0 },
		new short[] { 5, -14, 6, -14, 7, -14, 8, -14, 9, -14, 10, -14, 27, -14, -1, 0 },
		new short[] { 4, 132, -1, 0 },
		new short[] { 11, 129, -1, 0 },
		new short[] { 1, 110, 4, 83, 5, 81, 6, 78, 7, 72, 8, 70, 9, 79, 10, 74, 11, 82, 12, 75, 20, 80, 21, 73, 22, 76, 23, 69, 27, 67, 28, 115, -1, 0 },
		new short[] { 4, 105, -1, 0 },
		new short[] { 1, -106, 7, 17, 8, 16, 12, -106, 20, 31, 27, 13, 28, -106, -1, 0 },
		new short[] { 5, -17, 6, -17, 7, -17, 8, -17, 9, -17, 10, -17, 27, -17, -1, 0 },
		new short[] { 1, -43, 12, -43, 20, -43, 28, -43, -1, 0 },
		new short[] { 1, -22, 7, -22, 8, -22, 12, -22, 20, -22, 27, -22, 28, -22, -1, 0 },
		new short[] { 1, -41, 12, -41, 28, -41, -1, 0 },
		new short[] { 21, 91, 22, 89, 23, 90, -1, 0 },
		new short[] { 1, -106, 12, 36, 28, -106, -1, 0 },
		new short[] { 1, -40, 12, -40, 20, 31, 28, -40, -1, 0 },
		new short[] { 1, -42, 12, -42, 20, -42, 28, -42, -1, 0 },
		new short[] { 1, 46, 28, 41, -1, 0 },
		new short[] { 11, 38, -1, 0 },
		new short[] { 1, -56, 28, -56, -1, 0 },
		new short[] { 1, 40, 28, 41, -1, 0 },
		new short[] { 13, -55, -1, 0 },
		new short[] { 13, -82, -1, 0 },
		new short[] { 13, -81, 18, -81, -1, 0 },
		new short[] { 13, 43, -1, 0 },
		new short[] { 1, -54, 28, -54, -1, 0 },
		new short[] { 18, -60, -1, 0 },
		new short[] { 0, -2, 1, 46, 28, 41, -1, 0 },
		new short[] { 13, -62, 18, -82, -1, 0 },
		new short[] { 0, -58, 1, -58, 28, -58, -1, 0 },
		new short[] { 13, 49, -1, 0 },
		new short[] { 0, -61, 1, -61, 28, -61, -1, 0 },
		new short[] { 0, -57, 1, -57, 28, -57, -1, 0 },
		new short[] { 18, 52, -1, 0 },
		new short[] { 1, -106, 13, -106, 19, -106, 24, -106, 28, -106, 29, -106, -1, 0 },
		new short[] { 13, 86, 19, 87, -1, 0 },
		new short[] { 1, 58, 13, -66, 19, -66, 24, 61, 28, 59, 29, 60, -1, 0 },
		new short[] { 1, -68, 13, -68, 19, -68, 24, -68, 28, -68, 29, -68, -1, 0 },
		new short[] { 13, -64, 19, -64, -1, 0 },
		new short[] { 1, -67, 13, -67, 19, -67, 24, -67, 28, -67, 29, -67, -1, 0 },
		new short[] { 1, -84, 13, -84, 14, -84, 17, -84, 19, -84, 24, -84, 28, -84, 29, -84, -1, 0 },
		new short[] { 1, -83, 13, -83, 14, -83, 17, -83, 19, -83, 24, -83, 28, -83, 29, -83, -1, 0 },
		new short[] { 1, -70, 13, -70, 19, -70, 24, -70, 28, -70, 29, -70, -1, 0 },
		new short[] { 1, 58, 28, 59, -1, 0 },
		new short[] { 1, -106, 13, -106, 17, 63, 19, -106, 24, -106, 28, -106, 29, -106, -1, 0 },
		new short[] { 1, 68, 4, 83, 5, 81, 6, 78, 7, 72, 8, 70, 9, 79, 10, 74, 11, 82, 12, 75, 20, 80, 21, 73, 22, 76, 23, 69, 27, 67, 28, 77, -1, 0 },
		new short[] { 1, -69, 13, -69, 19, -69, 24, -69, 28, -69, 29, -69, -1, 0 },
		new short[] { 1, -72, 13, -72, 19, -72, 24, -72, 28, -72, 29, -72, -1, 0 },
		new short[] { 1, -85, 13, -85, 19, -85, 24, -85, 28, -85, 29, -85, -1, 0 },
		new short[] { 1, -92, 13, -92, 16, -92, 19, -92, 24, -92, 25, -92, 28, -92, 29, -92, -1, 0 },
		new short[] { 1, -101, 13, -101, 16, -101, 19, -101, 24, -101, 25, -101, 28, -101, 29, -101, -1, 0 },
		new short[] { 1, -100, 13, -100, 16, -100, 19, -100, 24, -100, 25, -100, 28, -100, 29, -100, -1, 0 },
		new short[] { 1, -91, 13, -91, 16, -91, 19, -91, 24, -91, 25, -91, 28, -91, 29, -91, -1, 0 },
		new short[] { 1, -71, 13, -71, 19, -71, 24, -71, 28, -71, 29, -71, -1, 0 },
		new short[] { 1, -90, 13, -90, 16, -90, 19, -90, 24, -90, 25, -90, 28, -90, 29, -90, -1, 0 },
		new short[] { 1, -98, 13, -98, 16, -98, 19, -98, 24, -98, 25, -98, 28, -98, 29, -98, -1, 0 },
		new short[] { 1, -94, 13, -94, 16, -94, 19, -94, 24, -94, 25, -94, 28, -94, 29, -94, -1, 0 },
		new short[] { 1, -96, 13, -96, 16, -96, 19, -96, 24, -96, 25, -96, 28, -96, 29, -96, -1, 0 },
		new short[] { 1, -99, 13, -99, 16, -99, 19, -99, 24, -99, 25, -99, 28, -99, 29, -99, -1, 0 },
		new short[] { 1, -86, 13, -86, 16, -86, 19, -86, 24, -86, 25, -86, 28, -86, 29, -86, -1, 0 },
		new short[] { 1, -89, 13, -89, 16, -89, 19, -89, 24, -89, 25, -89, 28, -89, 29, -89, -1, 0 },
		new short[] { 1, -93, 13, -93, 16, -93, 19, -93, 24, -93, 25, -93, 28, -93, 29, -93, -1, 0 },
		new short[] { 1, -97, 13, -97, 16, -97, 19, -97, 24, -97, 25, -97, 28, -97, 29, -97, -1, 0 },
		new short[] { 1, -88, 13, -88, 16, -88, 19, -88, 24, -88, 25, -88, 28, -88, 29, -88, -1, 0 },
		new short[] { 1, -95, 13, -95, 16, -95, 19, -95, 24, -95, 25, -95, 28, -95, 29, -95, -1, 0 },
		new short[] { 1, -87, 13, -87, 16, -87, 19, -87, 24, -87, 25, -87, 28, -87, 29, -87, -1, 0 },
		new short[] { 13, -65, 19, -65, -1, 0 },
		new short[] { 13, -53, 14, -53, 19, -53, -1, 0 },
		new short[] { 0, -59, 1, -59, 28, -59, -1, 0 },
		new short[] { 1, -106, 13, -106, 19, -106, 24, -106, 28, -106, 29, -106, -1, 0 },
		new short[] { 13, -63, 19, -63, -1, 0 },
		new short[] { 1, -47, 28, -47, -1, 0 },
		new short[] { 1, -49, 28, -49, -1, 0 },
		new short[] { 1, -45, 28, -45, -1, 0 },
		new short[] { 1, 58, 28, 59, -1, 0 },
		new short[] { 13, -51, 14, -51, -1, 0 },
		new short[] { 13, 97, 14, 96, -1, 0 },
		new short[] { 13, -52, 14, -52, -1, 0 },
		new short[] { 1, 58, 28, 59, -1, 0 },
		new short[] { 1, -44, 12, -44, 20, -44, 28, -44, -1, 0 },
		new short[] { 13, -50, 14, -50, -1, 0 },
		new short[] { 1, 58, 28, 59, -1, 0 },
		new short[] { 13, 101, 14, 96, -1, 0 },
		new short[] { 1, -48, 12, -48, 20, -48, 28, -48, -1, 0 },
		new short[] { 1, 58, 28, 59, -1, 0 },
		new short[] { 13, 104, 14, 96, -1, 0 },
		new short[] { 1, -46, 12, -46, 20, -46, 28, -46, -1, 0 },
		new short[] { 29, 106, -1, 0 },
		new short[] { 5, -104, 6, -104, 7, -104, 8, -104, 9, -104, 10, -104, 13, 108, 27, -104, -1, 0 },
		new short[] { 5, -18, 6, -18, 7, -18, 8, -18, 9, -18, 10, -18, 27, -18, -1, 0 },
		new short[] { 5, -105, 6, -105, 7, -105, 8, -105, 9, -105, 10, -105, 27, -105, -1, 0 },
		new short[] { 13, -74, 16, -74, 25, -74, 28, -74, -1, 0 },
		new short[] { 13, -31, 16, -101, 25, -101, 28, -101, -1, 0 },
		new short[] { 25, 124, 28, 119, -1, 0 },
		new short[] { 13, -39, 14, -39, -1, 0 },
		new short[] { 16, 122, 25, -77, 28, -77, -1, 0 },
		new short[] { 13, -35, 14, 118, -1, 0 },
		new short[] { 13, -80, 14, -80, 16, -86, 25, -86, 28, -86, -1, 0 },
		new short[] { 1, -27, 7, -27, 8, -27, 12, -27, 20, -27, 27, -27, 28, -27, -1, 0 },
		new short[] { 13, 121, -1, 0 },
		new short[] { 28, 119, -1, 0 },
		new short[] { 13, -80, 14, -80, -1, 0 },
		new short[] { 13, -38, 14, -38, -1, 0 },
		new short[] { 1, -34, 7, -34, 8, -34, 12, -34, 20, -34, 27, -34, 28, -34, -1, 0 },
		new short[] { 1, 68, 4, 83, 5, 81, 6, 78, 7, 72, 8, 70, 9, 79, 10, 74, 11, 82, 12, 75, 20, 80, 21, 73, 22, 76, 23, 69, 27, 67, 28, 77, -1, 0 },
		new short[] { 13, -73, 16, -73, 25, -73, 28, -73, -1, 0 },
		new short[] { 26, 126, -1, 0 },
		new short[] { 1, -26, 7, -26, 8, -26, 12, -26, 20, -26, 27, -26, 28, -26, -1, 0 },
		new short[] { 25, -78, 28, -78, -1, 0 },
		new short[] { 13, 128, -1, 0 },
		new short[] { 1, -30, 7, -30, 8, -30, 12, -30, 20, -30, 27, -30, 28, -30, -1, 0 },
		new short[] { 29, 130, -1, 0 },
		new short[] { 5, -104, 6, -104, 7, -104, 8, -104, 9, -104, 10, -104, 13, 108, 27, -104, -1, 0 },
		new short[] { 5, -20, 6, -20, 7, -20, 8, -20, 9, -20, 10, -20, 27, -20, -1, 0 },
		new short[] { 29, 133, -1, 0 },
		new short[] { 5, -104, 6, -104, 7, -104, 8, -104, 9, -104, 10, -104, 13, 108, 27, -104, -1, 0 },
		new short[] { 5, -19, 6, -19, 7, -19, 8, -19, 9, -19, 10, -19, 27, -19, -1, 0 },
		new short[] { 29, 136, -1, 0 },
		new short[] { 5, -104, 6, -104, 7, -104, 8, -104, 9, -104, 10, -104, 13, 108, 27, -104, -1, 0 },
		new short[] { 5, -21, 6, -21, 7, -21, 8, -21, 9, -21, 10, -21, 27, -21, -1, 0 },
		new short[] { 1, -25, 7, -25, 8, -25, 12, -25, 20, -25, 27, -25, 28, -25, -1, 0 },
		new short[] { 13, -29, 16, -101, 25, -101, 28, -101, -1, 0 },
		new short[] { 13, -33, 14, 146, -1, 0 },
		new short[] { 25, 124, 28, 145, -1, 0 },
		new short[] { 13, -37, 14, -37, -1, 0 },
		new short[] { 13, -79, 14, -79, 16, -86, 25, -86, 28, -86, -1, 0 },
		new short[] { 1, -24, 7, -24, 8, -24, 12, -24, 20, -24, 27, -24, 28, -24, -1, 0 },
		new short[] { 13, -79, 14, -79, -1, 0 },
		new short[] { 28, 145, -1, 0 },
		new short[] { 13, 148, -1, 0 },
		new short[] { 1, -32, 7, -32, 8, -32, 12, -32, 20, -32, 27, -32, 28, -32, -1, 0 },
		new short[] { 13, -36, 14, -36, -1, 0 },
		new short[] { 13, 151, -1, 0 },
		new short[] { 1, -28, 7, -28, 8, -28, 12, -28, 20, -28, 27, -28, 28, -28, -1, 0 },
		new short[] { 1, -102, 4, -102, 5, -102, 6, -102, 7, -102, 8, -102, 9, -102, 10, -102, 11, -102, 12, -102, 20, -102, 21, -102, 22, -102, 23, -102, 27, -102, 28, -102, -1, 0 },
		new short[] { 13, -11, -1, 0 },
		new short[] { 13, -76, 16, 155, -1, 0 },
		new short[] { 1, 68, 4, 83, 5, 81, 6, 78, 7, 72, 8, 70, 9, 79, 10, 74, 11, 82, 12, 75, 15, 156, 20, 80, 21, 73, 22, 76, 23, 69, 27, 67, 28, 77, -1, 0 },
		new short[] { 13, -75, -1, 0 },
		new short[] { 13, 158, -1, 0 },
		new short[] { 3, -10, 5, -10, 6, -10, 7, -10, 8, -10, 9, -10, 10, -10, 27, -10, -1, 0 },
		new short[] { 13, -6, 16, 122, -1, 0 },
		new short[] { 13, 161, -1, 0 },
		new short[] { 3, -5, 5, -5, 6, -5, 7, -5, 8, -5, 9, -5, 10, -5, 27, -5, -1, 0 },
		new short[] { 1, -106, 7, 17, 8, 16, 12, -106, 20, 31, 27, 13, 28, -106, -1, 0 },
		new short[] { 1, -106, 12, 36, 28, -106, -1, 0 },
		new short[] { 1, 46, 28, 41, -1, 0 },
		new short[] { 0, -4, 1, 46, 28, 41, -1, 0 },
		new short[] { 0, -1, -1, 0 }
 };
  /** Access to parse-action table. */
	public short[][] getActionTable() {
		return actionTable;
	}

	/** <code>reduce_goto</code> table. */
	protected static final short[][] reduceTable = 
	new short[][] {
		new short[] { 1, 1, 43, 3, -1, -1 },
		new short[] { -1, -1 },
		new short[] { 8, 23, 10, 161, 18, 13, -1, -1 },
		new short[] { 2, 6, 29, 5, -1, -1 },
		new short[] { 13, 158, 42, 108, -1, -1 },
		new short[] { -1, -1 },
		new short[] { 3, 7, 29, 8, -1, -1 },
		new short[] { 5, 10, 14, 11, -1, -1 },
		new short[] { -1, -1 },
		new short[] { 13, 153, 15, 152, 42, 108, -1, -1 },
		new short[] { 4, 19, 6, 26, 8, 23, 9, 14, 10, 25, 16, 20, 17, 17, 18, 13, -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { 13, 112, 19, 140, 20, 139, 25, 141, 34, 137, 42, 108, -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { 13, 112, 19, 110, 21, 113, 26, 111, 35, 115, 42, 108, -1, -1 },
		new short[] { -1, -1 },
		new short[] { 8, 23, 18, 28, 29, 29, 30, 31, 31, 27, 33, 32, -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { 11, 34, 29, 36, -1, -1 },
		new short[] { 31, 33, -1, -1 },
		new short[] { -1, -1 },
		new short[] { 12, 44, 22, 46, 36, 43, -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { 36, 38, -1, -1 },
		new short[] { 53, 41, -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { 54, 50, -1, -1 },
		new short[] { 22, 49, 36, 43, -1, -1 },
		new short[] { 55, 47, -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { 23, 53, 27, 52, 28, 55, 29, 54, -1, -1 },
		new short[] { -1, -1 },
		new short[] { 24, 56, 37, 61, -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { 37, 84, 41, 83, -1, -1 },
		new short[] { 29, 64, 39, 63, -1, -1 },
		new short[] { 38, 70, 42, 65, -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { 23, 53, 28, 87, 29, 54, -1, -1 },
		new short[] { -1, -1 },
		new short[] { 51, 101, -1, -1 },
		new short[] { 52, 98, -1, -1 },
		new short[] { 50, 91, -1, -1 },
		new short[] { 32, 93, 37, 84, 40, 92, 41, 94, -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { 37, 84, 40, 97, 41, 94, -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { 32, 99, 37, 84, 40, 92, 41, 94, -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { 32, 102, 37, 84, 40, 92, 41, 94, -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { 7, 106, -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { 47, 126, -1, -1 },
		new short[] { 21, 113, 26, 111, 35, 124, -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { 49, 116, -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { 26, 119, -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { 42, 122, -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { 7, 130, -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { 7, 133, -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { 7, 136, -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { 46, 149, -1, -1 },
		new short[] { 48, 146, -1, -1 },
		new short[] { 20, 139, 25, 141, 34, 143, -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { 25, 148, -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { 45, 156, -1, -1 },
		new short[] { -1, -1 },
		new short[] { 42, 122, -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { 44, 159, -1, -1 },
		new short[] { -1, -1 },
		new short[] { -1, -1 },
		new short[] { 8, 23, 18, 28, 29, 29, 30, 162, 31, 27, 33, 32, -1, -1 },
		new short[] { 11, 163, 29, 36, -1, -1 },
		new short[] { 12, 164, 22, 46, 36, 43, -1, -1 },
		new short[] { 22, 49, 36, 43, -1, -1 },
		new short[] { -1, -1 }
 };
	/** Access to <code>reduce_goto</code> table. */
	public short[][] getReduceTable() {
		return reduceTable;
	}

	/** Instance of action encapsulation class. */
	protected Actions actionObject;

	/** Action encapsulation object initializer. */
	protected void initActions() {
		actionObject = new Actions(this);
	}

	/** Invoke a user supplied parse action. */
	public LrSymbol runAction(LrParserContext parserContext, int actionId) throws Exception {
		/* call code in generated class */
		return actionObject.runAction(parserContext, actionId);
	}

	/** Indicates start state. */
	public int startState() {
		return 0;
	}
	/** Indicates start production. */
	public int startProduction() {
		return 0;
	}

	/** <code>EOF</code> Symbol index. */
	public int eofSymbol() {
		return 0;
	}

	/** <code>error</code> Symbol index. */
	public int errorSymbol() {
		return 1;
	}


	/** User initialization code. */
	public void userInit() throws Exception {
 lexer.init(); 
	}



	public final BnfModel model = new BnfModel();

	/** the lexer used */
	public NewLexer lexer;


  /* override error routines */

  public void report_fatal_error(
    String   message,
    Object   info)
    {
//      done_parsing();
      lexer.emit_error(message);
      System.err.println("Can't recover from previous error(s), giving up.");
      System.exit(1);
    }

    public void report_error(String message, Object info)
    {
      lexer.emit_error(message);
    }

}
