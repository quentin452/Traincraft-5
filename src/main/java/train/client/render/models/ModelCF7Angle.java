//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: CF7 Angle Cab
// Model Creator: Bidahochi
// Created on: 26.12.2021 - 10:15:49
// Last changed on: 26.12.2021 - 10:15:49

package train.client.render.models; //Path where the model is located

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;
import fexcraft.tmt.slim.Tessellator;
import train.common.api.AbstractTrains;
import train.common.core.util.DepreciatedUtil;
import train.common.library.Info;

import java.util.ArrayList;

public class ModelCF7Angle extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelCF7Angle() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[519];

		initbodyModel_1();
		initbodyModel_2();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 116, 220, textureX, textureY); // Box 4
		bodyModel[1] = new ModelRendererTurbo(this, 48, 150, textureX, textureY); // Box 48
		bodyModel[2] = new ModelRendererTurbo(this, 28, 220, textureX, textureY); // Box 132
		bodyModel[3] = new ModelRendererTurbo(this, 7, 220, textureX, textureY); // Box 133
		bodyModel[4] = new ModelRendererTurbo(this, 116, 220, textureX, textureY); // Box 261
		bodyModel[5] = new ModelRendererTurbo(this, 46, 157, textureX, textureY); // Box 135
		bodyModel[6] = new ModelRendererTurbo(this, 52, 165, textureX, textureY); // Box 139
		bodyModel[7] = new ModelRendererTurbo(this, 95, 150, textureX, textureY); // Box 209
		bodyModel[8] = new ModelRendererTurbo(this, 93, 157, textureX, textureY); // Box 210
		bodyModel[9] = new ModelRendererTurbo(this, 99, 165, textureX, textureY); // Box 211
		bodyModel[10] = new ModelRendererTurbo(this, 109, 225, textureX, textureY); // Box 2
		bodyModel[11] = new ModelRendererTurbo(this, 109, 225, textureX, textureY); // Box 336
		bodyModel[12] = new ModelRendererTurbo(this, 123, 241, textureX, textureY); // Box 4
		bodyModel[13] = new ModelRendererTurbo(this, 146, 241, textureX, textureY); // Box 346
		bodyModel[14] = new ModelRendererTurbo(this, 139, 158, textureX, textureY); // Box 259
		bodyModel[15] = new ModelRendererTurbo(this, 142, 164, textureX, textureY); // Box 260
		bodyModel[16] = new ModelRendererTurbo(this, 152, 164, textureX, textureY); // Box 246
		bodyModel[17] = new ModelRendererTurbo(this, 85, 180, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 49, 180, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 132, 180, textureX, textureY); // Box 20
		bodyModel[20] = new ModelRendererTurbo(this, 96, 180, textureX, textureY); // Box 21
		bodyModel[21] = new ModelRendererTurbo(this, 15, 165, textureX, textureY); // Box 61
		bodyModel[22] = new ModelRendererTurbo(this, 37, 165, textureX, textureY); // Box 356
		bodyModel[23] = new ModelRendererTurbo(this, 24, 160, textureX, textureY); // Box 151
		bodyModel[24] = new ModelRendererTurbo(this, 93, 201, textureX, textureY); // Box 184
		bodyModel[25] = new ModelRendererTurbo(this, 31, 202, textureX, textureY); // Box 150
		bodyModel[26] = new ModelRendererTurbo(this, 18, 212, textureX, textureY); // Box 582
		bodyModel[27] = new ModelRendererTurbo(this, 20, 210, textureX, textureY); // Box 38
		bodyModel[28] = new ModelRendererTurbo(this, 26, 194, textureX, textureY); // Box 7
		bodyModel[29] = new ModelRendererTurbo(this, 42, 204, textureX, textureY); // Box 374
		bodyModel[30] = new ModelRendererTurbo(this, 18, 207, textureX, textureY); // Box 41
		bodyModel[31] = new ModelRendererTurbo(this, 19, 202, textureX, textureY); // Box 42
		bodyModel[32] = new ModelRendererTurbo(this, 20, 197, textureX, textureY); // Box 43
		bodyModel[33] = new ModelRendererTurbo(this, 33, 203, textureX, textureY); // Box 49
		bodyModel[34] = new ModelRendererTurbo(this, 21, 205, textureX, textureY); // Box 50
		bodyModel[35] = new ModelRendererTurbo(this, 21, 200, textureX, textureY); // Box 51
		bodyModel[36] = new ModelRendererTurbo(this, 410, 193, textureX, textureY); // Box 53
		bodyModel[37] = new ModelRendererTurbo(this, 423, 196, textureX, textureY); // Box 54
		bodyModel[38] = new ModelRendererTurbo(this, 408, 166, textureX, textureY); // Box 55
		bodyModel[39] = new ModelRendererTurbo(this, 403, 196, textureX, textureY, "lamp"); // Box 71 markerlight cull
		bodyModel[40] = new ModelRendererTurbo(this, 430, 193, textureX, textureY); // Box 235
		bodyModel[41] = new ModelRendererTurbo(this, 403, 196, textureX, textureY, "lamp"); // Box 124 markerlight cull
		bodyModel[42] = new ModelRendererTurbo(this, 408, 152, textureX, textureY); // Box 125
		bodyModel[43] = new ModelRendererTurbo(this, 402, 213, textureX, textureY); // Box 143
		bodyModel[44] = new ModelRendererTurbo(this, 443, 200, textureX, textureY); // Box 338
		bodyModel[45] = new ModelRendererTurbo(this, 456, 200, textureX, textureY); // Box 340
		bodyModel[46] = new ModelRendererTurbo(this, 454, 198, textureX, textureY); // Box 344
		bodyModel[47] = new ModelRendererTurbo(this, 100, 186, textureX, textureY); // Box 63
		bodyModel[48] = new ModelRendererTurbo(this, 240, 194, textureX, textureY); // Box 37
		bodyModel[49] = new ModelRendererTurbo(this, 4, 186, textureX, textureY); // Box 65
		bodyModel[50] = new ModelRendererTurbo(this, 4, 187, textureX, textureY); // Box 66
		bodyModel[51] = new ModelRendererTurbo(this, 9, 185, textureX, textureY); // Box 67
		bodyModel[52] = new ModelRendererTurbo(this, 9, 187, textureX, textureY); // Box 68
		bodyModel[53] = new ModelRendererTurbo(this, 9, 184, textureX, textureY); // Box 69
		bodyModel[54] = new ModelRendererTurbo(this, 18, 194, textureX, textureY); // Box 70
		bodyModel[55] = new ModelRendererTurbo(this, 20, 192, textureX, textureY); // Box 71
		bodyModel[56] = new ModelRendererTurbo(this, 48, 157, textureX, textureY); // Box 72
		bodyModel[57] = new ModelRendererTurbo(this, 18, 189, textureX, textureY); // Box 73
		bodyModel[58] = new ModelRendererTurbo(this, 21, 187, textureX, textureY); // Box 74
		bodyModel[59] = new ModelRendererTurbo(this, 19, 184, textureX, textureY); // Box 75
		bodyModel[60] = new ModelRendererTurbo(this, 21, 182, textureX, textureY); // Box 76
		bodyModel[61] = new ModelRendererTurbo(this, 20, 179, textureX, textureY); // Box 77
		bodyModel[62] = new ModelRendererTurbo(this, 33, 205, textureX, textureY); // Box 78
		bodyModel[63] = new ModelRendererTurbo(this, 42, 205, textureX, textureY); // Box 79
		bodyModel[64] = new ModelRendererTurbo(this, 95, 157, textureX, textureY); // Box 80
		bodyModel[65] = new ModelRendererTurbo(this, 109, 216, textureX, textureY); // Box 38
		bodyModel[66] = new ModelRendererTurbo(this, 229, 244, textureX, textureY); // Box 39
		bodyModel[67] = new ModelRendererTurbo(this, 176, 244, textureX, textureY); // Box 40
		bodyModel[68] = new ModelRendererTurbo(this, 67, 222, textureX, textureY); // Box 42
		bodyModel[69] = new ModelRendererTurbo(this, 44, 243, textureX, textureY); // Box 44
		bodyModel[70] = new ModelRendererTurbo(this, 248, 234, textureX, textureY); // Box 45
		bodyModel[71] = new ModelRendererTurbo(this, 226, 220, textureX, textureY); // Box 46
		bodyModel[72] = new ModelRendererTurbo(this, 227, 232, textureX, textureY); // Box 48
		bodyModel[73] = new ModelRendererTurbo(this, 248, 234, textureX, textureY); // Box 50
		bodyModel[74] = new ModelRendererTurbo(this, 166, 219, textureX, textureY); // Box 93
		bodyModel[75] = new ModelRendererTurbo(this, 187, 243, textureX, textureY); // Box 94
		bodyModel[76] = new ModelRendererTurbo(this, 187, 243, textureX, textureY); // Box 95
		bodyModel[77] = new ModelRendererTurbo(this, 34, 222, textureX, textureY); // Box 324
		bodyModel[78] = new ModelRendererTurbo(this, 44, 243, textureX, textureY); // Box 325
		bodyModel[79] = new ModelRendererTurbo(this, 226, 243, textureX, textureY); // Box 292
		bodyModel[80] = new ModelRendererTurbo(this, 229, 249, textureX, textureY); // Box 599
		bodyModel[81] = new ModelRendererTurbo(this, 176, 249, textureX, textureY); // Box 600
		bodyModel[82] = new ModelRendererTurbo(this, 227, 232, textureX, textureY); // Box 99
		bodyModel[83] = new ModelRendererTurbo(this, 226, 220, textureX, textureY); // Box 95
		bodyModel[84] = new ModelRendererTurbo(this, 270, 221, textureX, textureY); // Box 96
		bodyModel[85] = new ModelRendererTurbo(this, 249, 220, textureX, textureY); // Box 130
		bodyModel[86] = new ModelRendererTurbo(this, 250, 221, textureX, textureY); // Box 131
		bodyModel[87] = new ModelRendererTurbo(this, 250, 221, textureX, textureY); // Box 132
		bodyModel[88] = new ModelRendererTurbo(this, 226, 243, textureX, textureY); // Box 101
		bodyModel[89] = new ModelRendererTurbo(this, 95, 193, textureX, textureY); // Box 69
		bodyModel[90] = new ModelRendererTurbo(this, 95, 193, textureX, textureY); // Box 143
		bodyModel[91] = new ModelRendererTurbo(this, 31, 189, textureX, textureY); // Box 126
		bodyModel[92] = new ModelRendererTurbo(this, 9, 197, textureX, textureY); // Box 127
		bodyModel[93] = new ModelRendererTurbo(this, 115, 226, textureX, textureY); // Box 128
		bodyModel[94] = new ModelRendererTurbo(this, 96, 187, textureX, textureY); // Box 129
		bodyModel[95] = new ModelRendererTurbo(this, 96, 187, textureX, textureY); // Box 130
		bodyModel[96] = new ModelRendererTurbo(this, 96, 187, textureX, textureY); // Box 131
		bodyModel[97] = new ModelRendererTurbo(this, 96, 187, textureX, textureY); // Box 132
		bodyModel[98] = new ModelRendererTurbo(this, 93, 187, textureX, textureY); // Box 133
		bodyModel[99] = new ModelRendererTurbo(this, 93, 187, textureX, textureY); // Box 134
		bodyModel[100] = new ModelRendererTurbo(this, 93, 187, textureX, textureY); // Box 135
		bodyModel[101] = new ModelRendererTurbo(this, 93, 187, textureX, textureY); // Box 136
		bodyModel[102] = new ModelRendererTurbo(this, 225, 90, textureX, textureY); // Box 262
		bodyModel[103] = new ModelRendererTurbo(this, 214, 94, textureX, textureY); // Box 263
		bodyModel[104] = new ModelRendererTurbo(this, 195, 90, textureX, textureY); // Box 264
		bodyModel[105] = new ModelRendererTurbo(this, 244, 94, textureX, textureY); // Box 265
		bodyModel[106] = new ModelRendererTurbo(this, 244, 101, textureX, textureY, "lamp"); // Box 247 Headlight Rear
		bodyModel[107] = new ModelRendererTurbo(this, 244, 101, textureX, textureY, "lamp"); // Box 248 Headlight Rear
		bodyModel[108] = new ModelRendererTurbo(this, 225, 119, textureX, textureY); // Box 252
		bodyModel[109] = new ModelRendererTurbo(this, 225, 109, textureX, textureY); // Box 253
		bodyModel[110] = new ModelRendererTurbo(this, 239, 109, textureX, textureY); // Box 254
		bodyModel[111] = new ModelRendererTurbo(this, 234, 109, textureX, textureY); // Box 43
		bodyModel[112] = new ModelRendererTurbo(this, 235, 113, textureX, textureY); // Box 43
		bodyModel[113] = new ModelRendererTurbo(this, 238, 87, textureX, textureY); // Box 333
		bodyModel[114] = new ModelRendererTurbo(this, 247, 86, textureX, textureY, "lamp"); // Box 334 Rear Gyralight L
		bodyModel[115] = new ModelRendererTurbo(this, 254, 86, textureX, textureY, "lamp"); // Box 335 Rear Gyralight R
		bodyModel[116] = new ModelRendererTurbo(this, 246, 111, textureX, textureY); // Box 601
		bodyModel[117] = new ModelRendererTurbo(this, 215, 90, textureX, textureY); // Box 402
		bodyModel[118] = new ModelRendererTurbo(this, 251, 92, textureX, textureY, "lamp"); // Box 117 Numberboard R
		bodyModel[119] = new ModelRendererTurbo(this, 251, 92, textureX, textureY, "lamp"); // Box 118 Numberboard R
		bodyModel[120] = new ModelRendererTurbo(this, 82, 83, textureX, textureY); // Box 51
		bodyModel[121] = new ModelRendererTurbo(this, 132, 73, textureX, textureY); // Box 78
		bodyModel[122] = new ModelRendererTurbo(this, 132, 73, textureX, textureY); // Box 319
		bodyModel[123] = new ModelRendererTurbo(this, 157, 73, textureX, textureY); // Box 320
		bodyModel[124] = new ModelRendererTurbo(this, 157, 73, textureX, textureY); // Box 321
		bodyModel[125] = new ModelRendererTurbo(this, 181, 82, textureX, textureY); // Box 153 stack 1
		bodyModel[126] = new ModelRendererTurbo(this, 192, 82, textureX, textureY); // Box 154 stack 2
		bodyModel[127] = new ModelRendererTurbo(this, 192, 82, textureX, textureY); // Box 155 stack 3
		bodyModel[128] = new ModelRendererTurbo(this, 181, 82, textureX, textureY); // Box 156 stack 4
		bodyModel[129] = new ModelRendererTurbo(this, 304, 130, textureX, textureY); // Box 52 door swing right
		bodyModel[130] = new ModelRendererTurbo(this, 379, 103, textureX, textureY); // Box 68
		bodyModel[131] = new ModelRendererTurbo(this, 395, 96, textureX, textureY); // Box 69
		bodyModel[132] = new ModelRendererTurbo(this, 348, 117, textureX, textureY); // Box 70
		bodyModel[133] = new ModelRendererTurbo(this, 337, 104, textureX, textureY); // Box 74
		bodyModel[134] = new ModelRendererTurbo(this, 348, 101, textureX, textureY); // Box 75
		bodyModel[135] = new ModelRendererTurbo(this, 322, 101, textureX, textureY); // Box 76
		bodyModel[136] = new ModelRendererTurbo(this, 396, 133, textureX, textureY); // Box 72
		bodyModel[137] = new ModelRendererTurbo(this, 315, 133, textureX, textureY); // Box 190
		bodyModel[138] = new ModelRendererTurbo(this, 348, 111, textureX, textureY, "lamp"); // Box 117 Numberboard
		bodyModel[139] = new ModelRendererTurbo(this, 348, 111, textureX, textureY, "lamp"); // Box 118 Numberboard
		bodyModel[140] = new ModelRendererTurbo(this, 339, 99, textureX, textureY, "lamp"); // Box 186 Headlight Front
		bodyModel[141] = new ModelRendererTurbo(this, 339, 99, textureX, textureY, "lamp"); // Box 187 Headlight Front
		bodyModel[142] = new ModelRendererTurbo(this, 269, 118, textureX, textureY); // Box 313
		bodyModel[143] = new ModelRendererTurbo(this, 385, 130, textureX, textureY); // Box 314 door swing right
		bodyModel[144] = new ModelRendererTurbo(this, 107, 123, textureX, textureY); // Box 316
		bodyModel[145] = new ModelRendererTurbo(this, 288, 107, textureX, textureY); // Box 332
		bodyModel[146] = new ModelRendererTurbo(this, 326, 111, textureX, textureY); // Box 333
		bodyModel[147] = new ModelRendererTurbo(this, 395, 123, textureX, textureY); // Box 67
		bodyModel[148] = new ModelRendererTurbo(this, 428, 114, textureX, textureY); // Box 334
		bodyModel[149] = new ModelRendererTurbo(this, 428, 107, textureX, textureY); // Box 335
		bodyModel[150] = new ModelRendererTurbo(this, 93, 135, textureX, textureY); // Box 106
		bodyModel[151] = new ModelRendererTurbo(this, 73, 39, textureX, textureY); // Box 81
		bodyModel[152] = new ModelRendererTurbo(this, 70, 40, textureX, textureY); // Box 81
		bodyModel[153] = new ModelRendererTurbo(this, 70, 19, textureX, textureY); // Box 176
		bodyModel[154] = new ModelRendererTurbo(this, 73, 18, textureX, textureY); // Box 177
		bodyModel[155] = new ModelRendererTurbo(this, 90, 141, textureX, textureY); // Box 193
		bodyModel[156] = new ModelRendererTurbo(this, 77, 143, textureX, textureY); // Box 343
		bodyModel[157] = new ModelRendererTurbo(this, 56, 135, textureX, textureY); // Box 188 high enji box
		bodyModel[158] = new ModelRendererTurbo(this, 56, 143, textureX, textureY); // Box 73 low engi box
		bodyModel[159] = new ModelRendererTurbo(this, 78, 41, textureX, textureY); // Box 61
		bodyModel[160] = new ModelRendererTurbo(this, 83, 41, textureX, textureY); // Box 174
		bodyModel[161] = new ModelRendererTurbo(this, 78, 43, textureX, textureY); // Box 191
		bodyModel[162] = new ModelRendererTurbo(this, 78, 27, textureX, textureY); // Box 192
		bodyModel[163] = new ModelRendererTurbo(this, 87, 25, textureX, textureY); // Box 196
		bodyModel[164] = new ModelRendererTurbo(this, 89, 20, textureX, textureY); // Box 317
		bodyModel[165] = new ModelRendererTurbo(this, 78, 25, textureX, textureY); // Box 319
		bodyModel[166] = new ModelRendererTurbo(this, 113, 20, textureX, textureY); // Box 92
		bodyModel[167] = new ModelRendererTurbo(this, 92, 41, textureX, textureY); // Box 99
		bodyModel[168] = new ModelRendererTurbo(this, 191, 18, textureX, textureY); // Box 243
		bodyModel[169] = new ModelRendererTurbo(this, 196, 19, textureX, textureY); // Box 244
		bodyModel[170] = new ModelRendererTurbo(this, 188, 20, textureX, textureY); // Box 245
		bodyModel[171] = new ModelRendererTurbo(this, 185, 40, textureX, textureY); // Box 249
		bodyModel[172] = new ModelRendererTurbo(this, 180, 39, textureX, textureY); // Box 250
		bodyModel[173] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 251
		bodyModel[174] = new ModelRendererTurbo(this, 78, 20, textureX, textureY); // Box 207
		bodyModel[175] = new ModelRendererTurbo(this, 78, 22, textureX, textureY); // Box 208
		bodyModel[176] = new ModelRendererTurbo(this, 45, 160, textureX, textureY); // Box 61
		bodyModel[177] = new ModelRendererTurbo(this, 89, 160, textureX, textureY); // Box 63
		bodyModel[178] = new ModelRendererTurbo(this, 74, 157, textureX, textureY); // Box 80
		bodyModel[179] = new ModelRendererTurbo(this, 83, 160, textureX, textureY); // Box 144
		bodyModel[180] = new ModelRendererTurbo(this, 63, 156, textureX, textureY); // Box 145
		bodyModel[181] = new ModelRendererTurbo(this, 54, 157, textureX, textureY); // Box 147
		bodyModel[182] = new ModelRendererTurbo(this, 51, 160, textureX, textureY); // Box 148
		bodyModel[183] = new ModelRendererTurbo(this, 86, 160, textureX, textureY); // Box 430
		bodyModel[184] = new ModelRendererTurbo(this, 48, 160, textureX, textureY); // Box 433
		bodyModel[185] = new ModelRendererTurbo(this, 95, 160, textureX, textureY); // Box 222
		bodyModel[186] = new ModelRendererTurbo(this, 92, 160, textureX, textureY); // Box 223
		bodyModel[187] = new ModelRendererTurbo(this, 98, 160, textureX, textureY); // Box 224
		bodyModel[188] = new ModelRendererTurbo(this, 101, 157, textureX, textureY); // Box 225
		bodyModel[189] = new ModelRendererTurbo(this, 110, 156, textureX, textureY); // Box 226
		bodyModel[190] = new ModelRendererTurbo(this, 121, 157, textureX, textureY); // Box 227
		bodyModel[191] = new ModelRendererTurbo(this, 130, 160, textureX, textureY); // Box 228
		bodyModel[192] = new ModelRendererTurbo(this, 133, 160, textureX, textureY); // Box 229
		bodyModel[193] = new ModelRendererTurbo(this, 136, 160, textureX, textureY); // Box 230
		bodyModel[194] = new ModelRendererTurbo(this, 331, 111, textureX, textureY); // Box 336
		bodyModel[195] = new ModelRendererTurbo(this, 317, 113, textureX, textureY, "lamp"); // Box 337 Front Gyralight L
		bodyModel[196] = new ModelRendererTurbo(this, 324, 113, textureX, textureY, "lamp"); // Box 338 Front Gyralight R
		bodyModel[197] = new ModelRendererTurbo(this, 403, 208, textureX, textureY, "lamp"); // Box 573 Headlight Front Nose
		bodyModel[198] = new ModelRendererTurbo(this, 403, 201, textureX, textureY); // Box 574 nose light mount
		bodyModel[199] = new ModelRendererTurbo(this, 403, 208, textureX, textureY, "lamp"); // Box 575 Headlight Front Nose
		bodyModel[200] = new ModelRendererTurbo(this, 182, 142, textureX, textureY); // Box 90
		bodyModel[201] = new ModelRendererTurbo(this, 202, 144, textureX, textureY); // Box 91
		bodyModel[202] = new ModelRendererTurbo(this, 193, 144, textureX, textureY); // Box 318
		bodyModel[203] = new ModelRendererTurbo(this, 105, 20, textureX, textureY); // Box 322
		bodyModel[204] = new ModelRendererTurbo(this, 95, 20, textureX, textureY); // Box 244
		bodyModel[205] = new ModelRendererTurbo(this, 92, 20, textureX, textureY); // Box 245
		bodyModel[206] = new ModelRendererTurbo(this, 102, 20, textureX, textureY); // Box 246
		bodyModel[207] = new ModelRendererTurbo(this, 110, 20, textureX, textureY); // Box 247
		bodyModel[208] = new ModelRendererTurbo(this, 84, 61, textureX, textureY); // Box 609
		bodyModel[209] = new ModelRendererTurbo(this, 121, 61, textureX, textureY); // Box 610
		bodyModel[210] = new ModelRendererTurbo(this, 121, 61, textureX, textureY); // Box 256
		bodyModel[211] = new ModelRendererTurbo(this, 84, 61, textureX, textureY); // Box 257
		bodyModel[212] = new ModelRendererTurbo(this, 309, 207, textureX, textureY); // Box 114
		bodyModel[213] = new ModelRendererTurbo(this, 309, 204, textureX, textureY); // Box 74
		bodyModel[214] = new ModelRendererTurbo(this, 309, 210, textureX, textureY); // Box 78
		bodyModel[215] = new ModelRendererTurbo(this, 308, 200, textureX, textureY); // Box 245
		bodyModel[216] = new ModelRendererTurbo(this, 327, 226, textureX, textureY); // Box 327
		bodyModel[217] = new ModelRendererTurbo(this, 327, 220, textureX, textureY); // Box 328
		bodyModel[218] = new ModelRendererTurbo(this, 327, 232, textureX, textureY); // Box 329
		bodyModel[219] = new ModelRendererTurbo(this, 322, 226, textureX, textureY); // Box 330
		bodyModel[220] = new ModelRendererTurbo(this, 327, 223, textureX, textureY); // Box 331
		bodyModel[221] = new ModelRendererTurbo(this, 327, 229, textureX, textureY); // Box 332
		bodyModel[222] = new ModelRendererTurbo(this, 308, 187, textureX, textureY); // Box 268
		bodyModel[223] = new ModelRendererTurbo(this, 309, 191, textureX, textureY); // Box 269
		bodyModel[224] = new ModelRendererTurbo(this, 309, 194, textureX, textureY); // Box 270
		bodyModel[225] = new ModelRendererTurbo(this, 309, 197, textureX, textureY); // Box 271
		bodyModel[226] = new ModelRendererTurbo(this, 205, 78, textureX, textureY); // Box 391
		bodyModel[227] = new ModelRendererTurbo(this, 205, 68, textureX, textureY, "cull"); // Box 392 cull
		bodyModel[228] = new ModelRendererTurbo(this, 205, 68, textureX, textureY, "cull"); // Box 393 cull
		bodyModel[229] = new ModelRendererTurbo(this, 205, 78, textureX, textureY); // Box 394
		bodyModel[230] = new ModelRendererTurbo(this, 222, 68, textureX, textureY, "cull"); // Box 395 cull
		bodyModel[231] = new ModelRendererTurbo(this, 222, 78, textureX, textureY); // Box 396
		bodyModel[232] = new ModelRendererTurbo(this, 222, 68, textureX, textureY, "cull"); // Box 397 cull
		bodyModel[233] = new ModelRendererTurbo(this, 222, 78, textureX, textureY); // Box 398
		bodyModel[234] = new ModelRendererTurbo(this, 316, 207, textureX, textureY); // Box 323
		bodyModel[235] = new ModelRendererTurbo(this, 316, 210, textureX, textureY); // Box 324
		bodyModel[236] = new ModelRendererTurbo(this, 316, 204, textureX, textureY); // Box 325
		bodyModel[237] = new ModelRendererTurbo(this, 315, 200, textureX, textureY); // Box 326
		bodyModel[238] = new ModelRendererTurbo(this, 327, 204, textureX, textureY); // Box 378
		bodyModel[239] = new ModelRendererTurbo(this, 327, 210, textureX, textureY); // Box 379
		bodyModel[240] = new ModelRendererTurbo(this, 327, 207, textureX, textureY); // Box 380
		bodyModel[241] = new ModelRendererTurbo(this, 375, 234, textureX, textureY); // Box 184 o2 generator
		bodyModel[242] = new ModelRendererTurbo(this, 397, 220, textureX, textureY, "cull"); // Box 73 antenna plate cull
		bodyModel[243] = new ModelRendererTurbo(this, 422, 221, textureX, textureY, "cull"); // Box 282 antenna plate cull
		bodyModel[244] = new ModelRendererTurbo(this, 376, 230, textureX, textureY); // Box 185
		bodyModel[245] = new ModelRendererTurbo(this, 376, 224, textureX, textureY); // Box 287
		bodyModel[246] = new ModelRendererTurbo(this, 361, 241, textureX, textureY); // Box 301
		bodyModel[247] = new ModelRendererTurbo(this, 356, 241, textureX, textureY); // Box 302
		bodyModel[248] = new ModelRendererTurbo(this, 291, 243, textureX, textureY); // Box 307
		bodyModel[249] = new ModelRendererTurbo(this, 286, 246, textureX, textureY); // Box 308
		bodyModel[250] = new ModelRendererTurbo(this, 291, 246, textureX, textureY); // Box 309
		bodyModel[251] = new ModelRendererTurbo(this, 291, 249, textureX, textureY); // Box 310
		bodyModel[252] = new ModelRendererTurbo(this, 382, 219, textureX, textureY); // Box 345
		bodyModel[253] = new ModelRendererTurbo(this, 344, 244, textureX, textureY); // Box 401
		bodyModel[254] = new ModelRendererTurbo(this, 339, 244, textureX, textureY); // Box 402
		bodyModel[255] = new ModelRendererTurbo(this, 95, 76, textureX, textureY); // Box 360 torpedo tueb
		bodyModel[256] = new ModelRendererTurbo(this, 92, 77, textureX, textureY); // Box 361
		bodyModel[257] = new ModelRendererTurbo(this, 92, 77, textureX, textureY); // Box 362
		bodyModel[258] = new ModelRendererTurbo(this, 92, 77, textureX, textureY); // Box 363
		bodyModel[259] = new ModelRendererTurbo(this, 95, 76, textureX, textureY); // Box 364 torpedo tueb
		bodyModel[260] = new ModelRendererTurbo(this, 92, 77, textureX, textureY); // Box 365
		bodyModel[261] = new ModelRendererTurbo(this, 182, 70, textureX, textureY); // Box 196 winterization hatch cull
		bodyModel[262] = new ModelRendererTurbo(this, 291, 222, textureX, textureY); // Box 275 amtrak horn
		bodyModel[263] = new ModelRendererTurbo(this, 291, 219, textureX, textureY); // Box 276 amtrak horn
		bodyModel[264] = new ModelRendererTurbo(this, 344, 230, textureX, textureY, "cull"); // Box 271 cull
		bodyModel[265] = new ModelRendererTurbo(this, 344, 233, textureX, textureY); // Box 272
		bodyModel[266] = new ModelRendererTurbo(this, 344, 236, textureX, textureY); // Box 273
		bodyModel[267] = new ModelRendererTurbo(this, 339, 233, textureX, textureY); // Box 274
		bodyModel[268] = new ModelRendererTurbo(this, 380, 204, textureX, textureY); // Box 364 prime base
		bodyModel[269] = new ModelRendererTurbo(this, 389, 204, textureX, textureY, "lamp"); // Box 6 PRIME2-1
		bodyModel[270] = new ModelRendererTurbo(this, 389, 204, textureX, textureY, "lamp"); // Box 7 PRIME2-3
		bodyModel[271] = new ModelRendererTurbo(this, 389, 204, textureX, textureY, "lamp"); // Box 8 PRIME2-2
		bodyModel[272] = new ModelRendererTurbo(this, 389, 204, textureX, textureY, "lamp"); // Box 9 PRIME2-4
		bodyModel[273] = new ModelRendererTurbo(this, 291, 226, textureX, textureY); // Box 354
		bodyModel[274] = new ModelRendererTurbo(this, 286, 232, textureX, textureY); // Box 355
		bodyModel[275] = new ModelRendererTurbo(this, 291, 232, textureX, textureY); // Box 356
		bodyModel[276] = new ModelRendererTurbo(this, 291, 238, textureX, textureY); // Box 357
		bodyModel[277] = new ModelRendererTurbo(this, 291, 235, textureX, textureY); // Box 358
		bodyModel[278] = new ModelRendererTurbo(this, 291, 229, textureX, textureY); // Box 359
		bodyModel[279] = new ModelRendererTurbo(this, 344, 241, textureX, textureY); // Box 346
		bodyModel[280] = new ModelRendererTurbo(this, 339, 241, textureX, textureY); // Box 347
		bodyModel[281] = new ModelRendererTurbo(this, 447, 219, textureX, textureY, "cull"); // Box 338 cage cull a
		bodyModel[282] = new ModelRendererTurbo(this, 447, 237, textureX, textureY, "cull"); // Box 305 cage cull b
		bodyModel[283] = new ModelRendererTurbo(this, 447, 231, textureX, textureY, "cull"); // Box 306 cage cull b
		bodyModel[284] = new ModelRendererTurbo(this, 341, 206, textureX, textureY); // Box 78
		bodyModel[285] = new ModelRendererTurbo(this, 341, 206, textureX, textureY); // Box 188
		bodyModel[286] = new ModelRendererTurbo(this, 348, 206, textureX, textureY, "lamp"); // Box 189 ditchlight f up
		bodyModel[287] = new ModelRendererTurbo(this, 348, 206, textureX, textureY, "lamp"); // Box 190 ditchlight f up
		bodyModel[288] = new ModelRendererTurbo(this, 356, 206, textureX, textureY); // Box 239
		bodyModel[289] = new ModelRendererTurbo(this, 363, 206, textureX, textureY, "lamp"); // Box 240 ditchlight r up
		bodyModel[290] = new ModelRendererTurbo(this, 363, 206, textureX, textureY, "lamp"); // Box 241 ditchlight r up
		bodyModel[291] = new ModelRendererTurbo(this, 356, 206, textureX, textureY); // Box 242
		bodyModel[292] = new ModelRendererTurbo(this, 341, 211, textureX, textureY); // Box 78
		bodyModel[293] = new ModelRendererTurbo(this, 341, 211, textureX, textureY); // Box 188
		bodyModel[294] = new ModelRendererTurbo(this, 348, 211, textureX, textureY, "lamp"); // Box 189 ditchlight f up2
		bodyModel[295] = new ModelRendererTurbo(this, 348, 211, textureX, textureY, "lamp"); // Box 190 ditchlight f up2
		bodyModel[296] = new ModelRendererTurbo(this, 356, 211, textureX, textureY); // Box 239
		bodyModel[297] = new ModelRendererTurbo(this, 363, 211, textureX, textureY, "lamp"); // Box 24 ditchlight r up2
		bodyModel[298] = new ModelRendererTurbo(this, 363, 211, textureX, textureY, "lamp"); // Box 241 ditchlight r up2
		bodyModel[299] = new ModelRendererTurbo(this, 356, 211, textureX, textureY); // Box 242
		bodyModel[300] = new ModelRendererTurbo(this, 348, 196, textureX, textureY, "lamp"); // Box 359 ditchlight f down3
		bodyModel[301] = new ModelRendererTurbo(this, 339, 196, textureX, textureY, "cull"); // Box 360 ditchlight cull
		bodyModel[302] = new ModelRendererTurbo(this, 339, 196, textureX, textureY, "cull"); // Box 361 ditchlight cull
		bodyModel[303] = new ModelRendererTurbo(this, 348, 196, textureX, textureY, "lamp"); // Box 362 ditchlight f down3
		bodyModel[304] = new ModelRendererTurbo(this, 341, 201, textureX, textureY); // Box 188
		bodyModel[305] = new ModelRendererTurbo(this, 348, 201, textureX, textureY, "lamp"); // Box 190 ditchlight f down2
		bodyModel[306] = new ModelRendererTurbo(this, 348, 201, textureX, textureY, "lamp"); // Box 371 ditchlight f down2
		bodyModel[307] = new ModelRendererTurbo(this, 341, 201, textureX, textureY); // Box 372
		bodyModel[308] = new ModelRendererTurbo(this, 341, 191, textureX, textureY); // Box 398
		bodyModel[309] = new ModelRendererTurbo(this, 348, 191, textureX, textureY, "lamp"); // Box 399 ditchlight f down
		bodyModel[310] = new ModelRendererTurbo(this, 348, 191, textureX, textureY, "lamp"); // Box 400 ditchlight f down
		bodyModel[311] = new ModelRendererTurbo(this, 341, 191, textureX, textureY); // Box 401
		bodyModel[312] = new ModelRendererTurbo(this, 363, 191, textureX, textureY, "lamp"); // Box 394 ditchlight r down
		bodyModel[313] = new ModelRendererTurbo(this, 356, 191, textureX, textureY); // Box 395
		bodyModel[314] = new ModelRendererTurbo(this, 363, 191, textureX, textureY, "lamp"); // Box 396 ditchlight r down
		bodyModel[315] = new ModelRendererTurbo(this, 356, 191, textureX, textureY); // Box 397
		bodyModel[316] = new ModelRendererTurbo(this, 356, 201, textureX, textureY); // Box 188
		bodyModel[317] = new ModelRendererTurbo(this, 363, 201, textureX, textureY, "lamp"); // Box 190 ditchlight r down2
		bodyModel[318] = new ModelRendererTurbo(this, 363, 201, textureX, textureY, "lamp"); // Box 371 ditchlight r down2
		bodyModel[319] = new ModelRendererTurbo(this, 356, 201, textureX, textureY); // Box 372
		bodyModel[320] = new ModelRendererTurbo(this, 344, 226, textureX, textureY); // Box 296
		bodyModel[321] = new ModelRendererTurbo(this, 327, 240, textureX, textureY); // Box 341
		bodyModel[322] = new ModelRendererTurbo(this, 327, 237, textureX, textureY); // Box 342
		bodyModel[323] = new ModelRendererTurbo(this, 327, 243, textureX, textureY); // Box 343
		bodyModel[324] = new ModelRendererTurbo(this, 344, 223, textureX, textureY); // Box 295
		bodyModel[325] = new ModelRendererTurbo(this, 339, 223, textureX, textureY); // Box 297
		bodyModel[326] = new ModelRendererTurbo(this, 322, 240, textureX, textureY); // Box 344
		bodyModel[327] = new ModelRendererTurbo(this, 344, 220, textureX, textureY); // Box 294
		bodyModel[328] = new ModelRendererTurbo(this, 311, 242, textureX, textureY); // Box 311
		bodyModel[329] = new ModelRendererTurbo(this, 306, 242, textureX, textureY); // Box 312
		bodyModel[330] = new ModelRendererTurbo(this, 382, 197, textureX, textureY); // Box 409 commander base
		bodyModel[331] = new ModelRendererTurbo(this, 387, 196, textureX, textureY, "lamp"); // Box 410 commander beacon
		bodyModel[332] = new ModelRendererTurbo(this, 333, 118, textureX, textureY); // Box 352
		bodyModel[333] = new ModelRendererTurbo(this, 326, 118, textureX, textureY, "lamp"); // Box 353 Amtrak Red Gyro Front
		bodyModel[334] = new ModelRendererTurbo(this, 361, 226, textureX, textureY); // Box 278
		bodyModel[335] = new ModelRendererTurbo(this, 361, 223, textureX, textureY); // Box 279
		bodyModel[336] = new ModelRendererTurbo(this, 361, 220, textureX, textureY); // Box 280
		bodyModel[337] = new ModelRendererTurbo(this, 356, 223, textureX, textureY, "cull"); // Box 281 cull
		bodyModel[338] = new ModelRendererTurbo(this, 382, 189, textureX, textureY); // Box 409 commander base
		bodyModel[339] = new ModelRendererTurbo(this, 387, 188, textureX, textureY, "lamp"); // Box 410 commander beacon
		bodyModel[340] = new ModelRendererTurbo(this, 382, 181, textureX, textureY); // Box 409 commander base
		bodyModel[341] = new ModelRendererTurbo(this, 387, 180, textureX, textureY, "lamp"); // Box 410 commander beacon
		bodyModel[342] = new ModelRendererTurbo(this, 459, 172, textureX, textureY); // Box 285
		bodyModel[343] = new ModelRendererTurbo(this, 472, 172, textureX, textureY); // Box 286
		bodyModel[344] = new ModelRendererTurbo(this, 473, 166, textureX, textureY); // Box 287
		bodyModel[345] = new ModelRendererTurbo(this, 468, 168, textureX, textureY); // Box 288
		bodyModel[346] = new ModelRendererTurbo(this, 468, 165, textureX, textureY); // Box 289
		bodyModel[347] = new ModelRendererTurbo(this, 475, 162, textureX, textureY); // Box 290
		bodyModel[348] = new ModelRendererTurbo(this, 498, 172, textureX, textureY); // Box 393
		bodyModel[349] = new ModelRendererTurbo(this, 486, 166, textureX, textureY); // Box 394
		bodyModel[350] = new ModelRendererTurbo(this, 485, 172, textureX, textureY); // Box 395
		bodyModel[351] = new ModelRendererTurbo(this, 497, 168, textureX, textureY); // Box 396
		bodyModel[352] = new ModelRendererTurbo(this, 497, 165, textureX, textureY); // Box 397
		bodyModel[353] = new ModelRendererTurbo(this, 488, 162, textureX, textureY); // Box 398
		bodyModel[354] = new ModelRendererTurbo(this, 380, 212, textureX, textureY); // Box 364 prime base
		bodyModel[355] = new ModelRendererTurbo(this, 389, 212, textureX, textureY, "lamp"); // Box 6 PRIME1-1
		bodyModel[356] = new ModelRendererTurbo(this, 389, 212, textureX, textureY, "lamp"); // Box 7 PRIME1-3
		bodyModel[357] = new ModelRendererTurbo(this, 389, 212, textureX, textureY, "lamp"); // Box 8 PRIME1-2
		bodyModel[358] = new ModelRendererTurbo(this, 389, 212, textureX, textureY, "lamp"); // Box 9 PRIME1-4
		bodyModel[359] = new ModelRendererTurbo(this, 385, 219, textureX, textureY); // Box 409
		bodyModel[360] = new ModelRendererTurbo(this, 333, 210, textureX, textureY); // Box 188 not a ditchlight mount
		bodyModel[361] = new ModelRendererTurbo(this, 333, 205, textureX, textureY); // Box 190 mu plug
		bodyModel[362] = new ModelRendererTurbo(this, 371, 210, textureX, textureY); // Box 188 not a ditchlight mount
		bodyModel[363] = new ModelRendererTurbo(this, 371, 205, textureX, textureY); // Box 190 mu plug
		bodyModel[364] = new ModelRendererTurbo(this, 204, 146, textureX, textureY); // Box 414
		bodyModel[365] = new ModelRendererTurbo(this, 24, 168, textureX, textureY); // Box 415
		bodyModel[366] = new ModelRendererTurbo(this, 42, 93, textureX, textureY); // DBox 89
		bodyModel[367] = new ModelRendererTurbo(this, 15, 87, textureX, textureY); // DBox 91
		bodyModel[368] = new ModelRendererTurbo(this, 25, 77, textureX, textureY); // DBox 101
		bodyModel[369] = new ModelRendererTurbo(this, 12, 77, textureX, textureY); // DBox 105
		bodyModel[370] = new ModelRendererTurbo(this, 46, 77, textureX, textureY); // DBox 172
		bodyModel[371] = new ModelRendererTurbo(this, 25, 82, textureX, textureY); // DBox 173
		bodyModel[372] = new ModelRendererTurbo(this, 12, 82, textureX, textureY); // DBox 176
		bodyModel[373] = new ModelRendererTurbo(this, 46, 82, textureX, textureY); // DBox 177
		bodyModel[374] = new ModelRendererTurbo(this, 25, 103, textureX, textureY); // DBox 178
		bodyModel[375] = new ModelRendererTurbo(this, 46, 103, textureX, textureY); // DBox 179
		bodyModel[376] = new ModelRendererTurbo(this, 46, 108, textureX, textureY); // DBox 180
		bodyModel[377] = new ModelRendererTurbo(this, 25, 108, textureX, textureY); // DBox 181
		bodyModel[378] = new ModelRendererTurbo(this, 12, 108, textureX, textureY); // DBox 182
		bodyModel[379] = new ModelRendererTurbo(this, 12, 103, textureX, textureY); // DBox 183
		bodyModel[380] = new ModelRendererTurbo(this, 311, 234, textureX, textureY); // Box 361
		bodyModel[381] = new ModelRendererTurbo(this, 302, 232, textureX, textureY); // Box 362
		bodyModel[382] = new ModelRendererTurbo(this, 311, 231, textureX, textureY); // Box 363
		bodyModel[383] = new ModelRendererTurbo(this, 311, 237, textureX, textureY); // Box 364
		bodyModel[384] = new ModelRendererTurbo(this, 263, 136, textureX, textureY); // Box 350
		bodyModel[385] = new ModelRendererTurbo(this, 266, 136, textureX, textureY); // Box 351
		bodyModel[386] = new ModelRendererTurbo(this, 252, 129, textureX, textureY); // box64
		bodyModel[387] = new ModelRendererTurbo(this, 235, 129, textureX, textureY); // box65
		bodyModel[388] = new ModelRendererTurbo(this, 252, 133, textureX, textureY); // box64
		bodyModel[389] = new ModelRendererTurbo(this, 235, 133, textureX, textureY); // box65
		bodyModel[390] = new ModelRendererTurbo(this, 311, 223, textureX, textureY); // Box 238 m&d 2632 moment
		bodyModel[391] = new ModelRendererTurbo(this, 304, 222, textureX, textureY); // Box 239 m&d 2632 moment
		bodyModel[392] = new ModelRendererTurbo(this, 311, 220, textureX, textureY); // Box 244 m&d 2632 moment
		bodyModel[393] = new ModelRendererTurbo(this, 311, 226, textureX, textureY); // Box 245 m&d 2632 moment
		bodyModel[394] = new ModelRendererTurbo(this, 356, 233, textureX, textureY); // Box 444
		bodyModel[395] = new ModelRendererTurbo(this, 361, 233, textureX, textureY); // Box 445
		bodyModel[396] = new ModelRendererTurbo(this, 361, 236, textureX, textureY); // Box 446
		bodyModel[397] = new ModelRendererTurbo(this, 361, 230, textureX, textureY); // Box 447
		bodyModel[398] = new ModelRendererTurbo(this, 376, 228, textureX, textureY); // Box 448
		bodyModel[399] = new ModelRendererTurbo(this, 163, 171, textureX, textureY); // Box 22
		bodyModel[400] = new ModelRendererTurbo(this, 215, 171, textureX, textureY); // Box 23
		bodyModel[401] = new ModelRendererTurbo(this, 176, 169, textureX, textureY); // Box 24
		bodyModel[402] = new ModelRendererTurbo(this, 228, 169, textureX, textureY); // Box 25
		bodyModel[403] = new ModelRendererTurbo(this, 319, 171, textureX, textureY); // Box 431
		bodyModel[404] = new ModelRendererTurbo(this, 267, 171, textureX, textureY); // Box 432
		bodyModel[405] = new ModelRendererTurbo(this, 280, 169, textureX, textureY); // Box 433
		bodyModel[406] = new ModelRendererTurbo(this, 332, 169, textureX, textureY); // Box 434
		bodyModel[407] = new ModelRendererTurbo(this, 376, 219, textureX, textureY); // Box 435
		bodyModel[408] = new ModelRendererTurbo(this, 189, 167, textureX, textureY); // Box 4
		bodyModel[409] = new ModelRendererTurbo(this, 241, 167, textureX, textureY); // Box 322
		bodyModel[410] = new ModelRendererTurbo(this, 202, 165, textureX, textureY); // Box 438
		bodyModel[411] = new ModelRendererTurbo(this, 254, 165, textureX, textureY); // Box 439
		bodyModel[412] = new ModelRendererTurbo(this, 345, 167, textureX, textureY); // Box 440
		bodyModel[413] = new ModelRendererTurbo(this, 293, 167, textureX, textureY); // Box 441
		bodyModel[414] = new ModelRendererTurbo(this, 358, 165, textureX, textureY); // Box 442
		bodyModel[415] = new ModelRendererTurbo(this, 306, 165, textureX, textureY); // Box 443
		bodyModel[416] = new ModelRendererTurbo(this, 382, 193, textureX, textureY); // Box 409 commander base
		bodyModel[417] = new ModelRendererTurbo(this, 387, 192, textureX, textureY, "lamp"); // Box 410 commander beacon
		bodyModel[418] = new ModelRendererTurbo(this, 379, 219, textureX, textureY); // Box 446
		bodyModel[419] = new ModelRendererTurbo(this, 382, 185, textureX, textureY); // Box 409 commander base
		bodyModel[420] = new ModelRendererTurbo(this, 387, 184, textureX, textureY, "lamp"); // Box 410 commander beacon
		bodyModel[421] = new ModelRendererTurbo(this, 423, 230, textureX, textureY, "cull"); // Box 282 antenna plate cull
		bodyModel[422] = new ModelRendererTurbo(this, 376, 222, textureX, textureY); // Box 450
		bodyModel[423] = new ModelRendererTurbo(this, 380, 208, textureX, textureY); // Box 364 prime base
		bodyModel[424] = new ModelRendererTurbo(this, 389, 208, textureX, textureY, "lamp"); // Box 6 PRIME3-1
		bodyModel[425] = new ModelRendererTurbo(this, 389, 208, textureX, textureY, "lamp"); // Box 7 PRIME3-3
		bodyModel[426] = new ModelRendererTurbo(this, 389, 208, textureX, textureY, "lamp"); // Box 8 PRIME3-2
		bodyModel[427] = new ModelRendererTurbo(this, 389, 208, textureX, textureY, "lamp"); // Box 9 PRIME3-4
		bodyModel[428] = new ModelRendererTurbo(this, 398, 230, textureX, textureY, "cull"); // Box 73 antenna plate cull
		bodyModel[429] = new ModelRendererTurbo(this, 376, 226, textureX, textureY); // Box 457
		bodyModel[430] = new ModelRendererTurbo(this, 438, 129, textureX, textureY); // Box 412 cs1
		bodyModel[431] = new ModelRendererTurbo(this, 458, 131, textureX, textureY); // Box 413 cs1
		bodyModel[432] = new ModelRendererTurbo(this, 450, 125, textureX, textureY); // Box 86 cs1
		bodyModel[433] = new ModelRendererTurbo(this, 501, 144, textureX, textureY); // Box 461 nose stairs hand rail inside your ass
		bodyModel[434] = new ModelRendererTurbo(this, 415, 222, textureX, textureY, "cull"); // Box 462 smol antenna plane cull
		bodyModel[435] = new ModelRendererTurbo(this, 388, 219, textureX, textureY); // Box 463
		bodyModel[436] = new ModelRendererTurbo(this, 382, 201, textureX, textureY); // Box 409 commander base
		bodyModel[437] = new ModelRendererTurbo(this, 387, 200, textureX, textureY, "lamp"); // Box 410 commander beacon
		bodyModel[438] = new ModelRendererTurbo(this, 502, 132, textureX, textureY); // Box 131 cs2
		bodyModel[439] = new ModelRendererTurbo(this, 500, 136, textureX, textureY); // Box 131 cs2
		bodyModel[440] = new ModelRendererTurbo(this, 481, 132, textureX, textureY); // Box 131 cs2
		bodyModel[441] = new ModelRendererTurbo(this, 486, 130, textureX, textureY); // Box 131 cs2
		bodyModel[442] = new ModelRendererTurbo(this, 495, 132, textureX, textureY); // Box 131 cs2
		bodyModel[443] = new ModelRendererTurbo(this, 486, 125, textureX, textureY); // Box 131 cs2
		bodyModel[444] = new ModelRendererTurbo(this, 489, 142, textureX, textureY); // Box 131 cs2
		bodyModel[445] = new ModelRendererTurbo(this, 480, 142, textureX, textureY); // Box 360 cs2
		bodyModel[446] = new ModelRendererTurbo(this, 435, 123, textureX, textureY); // Box 476 cs1 radio
		bodyModel[447] = new ModelRendererTurbo(this, 306, 250, textureX, textureY); // Box 478
		bodyModel[448] = new ModelRendererTurbo(this, 311, 253, textureX, textureY); // Box 479
		bodyModel[449] = new ModelRendererTurbo(this, 311, 250, textureX, textureY); // Box 480
		bodyModel[450] = new ModelRendererTurbo(this, 311, 247, textureX, textureY); // Box 481
		bodyModel[451] = new ModelRendererTurbo(this, 366, 87, textureX, textureY); // Box 482
		bodyModel[452] = new ModelRendererTurbo(this, 405, 240, textureX, textureY); // Box 364
		bodyModel[453] = new ModelRendererTurbo(this, 426, 241, textureX, textureY); // Box 365
		bodyModel[454] = new ModelRendererTurbo(this, 426, 241, textureX, textureY); // Box 366
		bodyModel[455] = new ModelRendererTurbo(this, 322, 204, textureX, textureY); // Box 490 TXR bell
		bodyModel[456] = new ModelRendererTurbo(this, 322, 207, textureX, textureY); // Box 491 TXR bell
		bodyModel[457] = new ModelRendererTurbo(this, 322, 210, textureX, textureY); // Box 492 TXR bell
		bodyModel[458] = new ModelRendererTurbo(this, 322, 201, textureX, textureY); // Box 493 TXR bell sponson
		bodyModel[459] = new ModelRendererTurbo(this, 361, 244, textureX, textureY); // Box 299
		bodyModel[460] = new ModelRendererTurbo(this, 356, 244, textureX, textureY); // Box 300
		bodyModel[461] = new ModelRendererTurbo(this, 487, 189, textureX, textureY, "cull"); // Box 3 cull AWW 2window
		bodyModel[462] = new ModelRendererTurbo(this, 489, 184, textureX, textureY); // Box 5 AWW 2window
		bodyModel[463] = new ModelRendererTurbo(this, 462, 189, textureX, textureY, "cull"); // Box 412 cull AWW 1window
		bodyModel[464] = new ModelRendererTurbo(this, 464, 184, textureX, textureY); // Box 413 AWW 1window
		bodyModel[465] = new ModelRendererTurbo(this, 42, 192, textureX, textureY); // Box 616
		bodyModel[466] = new ModelRendererTurbo(this, 33, 192, textureX, textureY); // Box 617
		bodyModel[467] = new ModelRendererTurbo(this, 33, 190, textureX, textureY); // Box 618
		bodyModel[468] = new ModelRendererTurbo(this, 4, 200, textureX, textureY); // Box 619
		bodyModel[469] = new ModelRendererTurbo(this, 9, 198, textureX, textureY); // Box 620
		bodyModel[470] = new ModelRendererTurbo(this, 9, 200, textureX, textureY); // Box 621
		bodyModel[471] = new ModelRendererTurbo(this, 4, 199, textureX, textureY); // Box 622
		bodyModel[472] = new ModelRendererTurbo(this, 42, 191, textureX, textureY); // Box 623
		bodyModel[473] = new ModelRendererTurbo(this, 20, 210, textureX, textureY); // Box 624
		bodyModel[474] = new ModelRendererTurbo(this, 18, 212, textureX, textureY); // Box 625
		bodyModel[475] = new ModelRendererTurbo(this, 18, 207, textureX, textureY); // Box 626
		bodyModel[476] = new ModelRendererTurbo(this, 21, 205, textureX, textureY); // Box 627
		bodyModel[477] = new ModelRendererTurbo(this, 19, 202, textureX, textureY); // Box 628
		bodyModel[478] = new ModelRendererTurbo(this, 21, 200, textureX, textureY); // Box 629
		bodyModel[479] = new ModelRendererTurbo(this, 20, 197, textureX, textureY); // Box 630
		bodyModel[480] = new ModelRendererTurbo(this, 20, 192, textureX, textureY); // Box 631
		bodyModel[481] = new ModelRendererTurbo(this, 18, 194, textureX, textureY); // Box 632
		bodyModel[482] = new ModelRendererTurbo(this, 21, 187, textureX, textureY); // Box 633
		bodyModel[483] = new ModelRendererTurbo(this, 18, 189, textureX, textureY); // Box 634
		bodyModel[484] = new ModelRendererTurbo(this, 21, 182, textureX, textureY); // Box 635
		bodyModel[485] = new ModelRendererTurbo(this, 19, 184, textureX, textureY); // Box 636
		bodyModel[486] = new ModelRendererTurbo(this, 20, 179, textureX, textureY); // Box 637
		bodyModel[487] = new ModelRendererTurbo(this, 158, 29, textureX, textureY, "cull"); // Box 488 handrail extension cull
		bodyModel[488] = new ModelRendererTurbo(this, 144, 50, textureX, textureY, "cull"); // Box 488 handrail extension cull
		bodyModel[489] = new ModelRendererTurbo(this, 393, 199, textureX, textureY); // Box 364 prime base
		bodyModel[490] = new ModelRendererTurbo(this, 393, 195, textureX, textureY, "lamp"); // Box 6 PRIME4-1
		bodyModel[491] = new ModelRendererTurbo(this, 393, 195, textureX, textureY, "lamp"); // Box 7 PRIME4-3
		bodyModel[492] = new ModelRendererTurbo(this, 393, 195, textureX, textureY, "lamp"); // Box 8 PRIME4-2
		bodyModel[493] = new ModelRendererTurbo(this, 393, 195, textureX, textureY, "lamp"); // Box 9 PRIME4-4
		bodyModel[494] = new ModelRendererTurbo(this, 463, 116, textureX, textureY); // Box 487 cab heater
		bodyModel[495] = new ModelRendererTurbo(this, 344, 250, textureX, textureY); // Box 495
		bodyModel[496] = new ModelRendererTurbo(this, 344, 247, textureX, textureY); // Box 496
		bodyModel[497] = new ModelRendererTurbo(this, 351, 253, textureX, textureY); // Box 497
		bodyModel[498] = new ModelRendererTurbo(this, 344, 253, textureX, textureY); // Box 498
		bodyModel[499] = new ModelRendererTurbo(this, 487, 206, textureX, textureY, "cull"); // Box 3 cull AWW 2window

		bodyModel[0].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 4
		bodyModel[0].setRotationPoint(-39.5F, 3F, -1.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 0, 6, 20, 0F); // Box 48
		bodyModel[1].setRotationPoint(-36.01F, 1F, -10F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[2].setRotationPoint(-38.01F, 6.5F, -8F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 133
		bodyModel[3].setRotationPoint(-38.01F, 6.5F, 0F);

		bodyModel[4].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 261
		bodyModel[4].setRotationPoint(36.5F, 3F, -1.5F);

		bodyModel[5].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 135
		bodyModel[5].setRotationPoint(-36.01F, 7.5F, -11F);

		bodyModel[6].addBox(0F, 0F, 0F, 0, 1, 16, 0F); // Box 139
		bodyModel[6].setRotationPoint(-36.01F, 8.5F, -8F);

		bodyModel[7].addBox(0F, 0F, 0F, 0, 6, 20, 0F); // Box 209
		bodyModel[7].setRotationPoint(36.01F, 1F, -10F);

		bodyModel[8].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 210
		bodyModel[8].setRotationPoint(36.01F, 7.5F, -11F);

		bodyModel[9].addBox(0F, 0F, 0F, 0, 1, 16, 0F); // Box 211
		bodyModel[9].setRotationPoint(36.01F, 8.5F, -8F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 2
		bodyModel[10].setRotationPoint(36F, 3F, -2F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 336
		bodyModel[11].setRotationPoint(-37F, 3F, -2F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 5, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[12].setRotationPoint(-36F, 2F, -3F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 5, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 346
		bodyModel[13].setRotationPoint(31F, 2F, -3F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[14].setRotationPoint(36F, 1F, -5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[15].setRotationPoint(36F, 1F, -7F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 246
		bodyModel[16].setRotationPoint(36F, 1F, 5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[17].setRotationPoint(-36.01F, 8.5F, -9F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 19
		bodyModel[18].setRotationPoint(-36.01F, 8.5F, 8F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 20
		bodyModel[19].setRotationPoint(36.01F, 8.5F, 8F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[20].setRotationPoint(36.01F, 8.5F, -9F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -5.5F, 0.5F, 0F, -5.5F, 0.5F, 0F, -5.5F, 0F, -1F, -5.5F, 0F); // Box 61
		bodyModel[21].setRotationPoint(-37F, 1F, 3F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0.5F, 0F, -5.5F, 0.5F); // Box 356
		bodyModel[22].setRotationPoint(-37F, 1F, -6F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 151
		bodyModel[23].setRotationPoint(-37F, 1F, -2.5F);

		bodyModel[24].addBox(0F, 0F, 0F, 72, 2, 12, 0F); // Box 184
		bodyModel[24].setRotationPoint(-36F, 1F, -6F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 150
		bodyModel[25].setRotationPoint(-32F, 1F, -9F);

		bodyModel[26].addBox(0F, 0F, 0F, 5, 0, 2, 0F); // Box 582
		bodyModel[26].setRotationPoint(-36F, 8.5F, -11F);

		bodyModel[27].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 38
		bodyModel[27].setRotationPoint(-36F, 7.5F, -9F);

		bodyModel[28].addBox(0F, 0F, 0F, 22, 2, 22, 0F); // Box 7
		bodyModel[28].setRotationPoint(-31F, 0F, -11F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 374
		bodyModel[29].setRotationPoint(-31F, 2F, -11F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 5, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.325F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[30].setRotationPoint(-36F, 6.25F, -9F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0.65F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[31].setRotationPoint(-36F, 4.5F, -8.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[32].setRotationPoint(-36F, 2.75F, -7.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 49
		bodyModel[33].setRotationPoint(-31F, 2F, -9F);
		bodyModel[33].rotateAngleY = 0.5846853F;

		bodyModel[34].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, -0.325F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[34].setRotationPoint(-36F, 5.25F, -7F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[35].setRotationPoint(-36F, 3.5F, -6.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 14, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 53
		bodyModel[36].setRotationPoint(-33F, -13F, 1F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 14, 2, 0F); // Box 54
		bodyModel[37].setRotationPoint(-33F, -13F, -1F);

		bodyModel[38].addBox(0F, 0F, 0F, 6, 14, 12, 0F); // Box 55
		bodyModel[38].setRotationPoint(-32F, -13F, -6F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F); // Box 71 markerlight cull
		bodyModel[39].setRotationPoint(-32.25F, -12F, -5.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 14, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[40].setRotationPoint(-33F, -13F, -6F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.3F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 124 markerlight cull
		bodyModel[41].setRotationPoint(-32.25F, -12F, 3.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 6, 1, 12, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[42].setRotationPoint(-32F, -14F, -6F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 143
		bodyModel[43].setRotationPoint(-32.5F, -13.5F, -1F);

		bodyModel[44].addBox(0F, 0F, 0F, 6, 11, 0, 0F); // Box 338
		bodyModel[44].setRotationPoint(-32.5F, -14F, -5.5F);

		bodyModel[45].addBox(0F, 0F, 0F, 2, 11, 0, 0F); // Box 340
		bodyModel[45].setRotationPoint(-32.5F, -14F, 5.5F);

		bodyModel[46].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 344
		bodyModel[46].setRotationPoint(-29.5F, -14F, 5.5F);
		bodyModel[46].rotateAngleY = -0.78539816F;

		bodyModel[47].addShapeBox(0F, 0F, 0F, 64, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[47].setRotationPoint(-32F, 3F, -6.5F);

		bodyModel[48].addBox(0F, 0F, 0F, 22, 2, 22, 0F); // Box 37
		bodyModel[48].setRotationPoint(9F, 0F, -11F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[49].setRotationPoint(-31F, 2F, 11F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 0, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 66
		bodyModel[50].setRotationPoint(-31F, 2F, 9F);

		bodyModel[51].addShapeBox(0F, 0F, -4F, 0, 2, 4, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[51].setRotationPoint(-31F, 2F, 9F);
		bodyModel[51].rotateAngleY = -0.5846853F;

		bodyModel[52].addShapeBox(0F, 0F, -4F, 0, 5, 4, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 68
		bodyModel[52].setRotationPoint(-31F, 4F, 9F);
		bodyModel[52].rotateAngleY = -0.5846853F;

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 69
		bodyModel[53].setRotationPoint(-32F, 1F, 6F);

		bodyModel[54].addBox(0F, 0F, 0F, 5, 0, 2, 0F); // Box 70
		bodyModel[54].setRotationPoint(-36F, 8.5F, 9F);

		bodyModel[55].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 71
		bodyModel[55].setRotationPoint(-36F, 7.5F, 9F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 72
		bodyModel[56].setRotationPoint(-36.01F, 7F, -10F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 5, 0, 2, 0F,0F, 0F, 0F, -1.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[57].setRotationPoint(-36F, 6.25F, 7F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, -0.325F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[58].setRotationPoint(-36F, 5.25F, 7F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.7F, 0F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[59].setRotationPoint(-36F, 4.5F, 6.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[60].setRotationPoint(-36F, 3.5F, 6.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, 0F, -0.325F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[61].setRotationPoint(-36F, 2.75F, 5.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 0, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F); // Box 78
		bodyModel[62].setRotationPoint(-31F, 4F, -9F);
		bodyModel[62].rotateAngleY = 0.5846853F;

		bodyModel[63].addShapeBox(0F, 0F, 0F, 0, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 79
		bodyModel[63].setRotationPoint(-31F, 2F, -11F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 80
		bodyModel[64].setRotationPoint(36.01F, 7F, -10F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 18, 3, 21, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 38
		bodyModel[65].setRotationPoint(-9F, 0F, -10.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[66].setRotationPoint(9F, 2F, -11F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 40
		bodyModel[67].setRotationPoint(-13F, 2F, -11F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 10, 2, 20, 0F,0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 42
		bodyModel[68].setRotationPoint(-1F, 4F, -10F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F); // Box 44
		bodyModel[69].setRotationPoint(-1F, 6F, -10F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[70].setRotationPoint(-9F, 4.5F, -10.5F);

		bodyModel[71].addBox(0F, 0F, 0F, 7, 4, 7, 0F); // Box 46
		bodyModel[71].setRotationPoint(-9F, 3.5F, -9.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 48
		bodyModel[72].setRotationPoint(-9F, 7.5F, -8.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 50
		bodyModel[73].setRotationPoint(-9F, 4.5F, 9.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 18, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 93
		bodyModel[74].setRotationPoint(-9F, 0F, -11F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 94
		bodyModel[75].setRotationPoint(-9F, 3.5F, -11F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 95
		bodyModel[76].setRotationPoint(-9F, 3.5F, 10F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 10, 3, 16, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F); // Box 324
		bodyModel[77].setRotationPoint(-1F, 6F, -8F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0.5F, -0.25F, -2F); // Box 325
		bodyModel[78].setRotationPoint(-1F, 6F, 8F);

		bodyModel[79].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 292
		bodyModel[79].setRotationPoint(4F, 2.5F, -11F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 599
		bodyModel[80].setRotationPoint(9F, 2F, 9F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 600
		bodyModel[81].setRotationPoint(-13F, 2F, 9F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 99
		bodyModel[82].setRotationPoint(-9F, 7.5F, 2.5F);

		bodyModel[83].addBox(0F, 0F, 0F, 7, 4, 7, 0F); // Box 95
		bodyModel[83].setRotationPoint(-9F, 3.5F, 2.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 96
		bodyModel[84].setRotationPoint(-10F, 3F, -0.5F);

		bodyModel[85].addBox(0F, 0F, 0F, 8, 4, 2, 0F); // Box 130
		bodyModel[85].setRotationPoint(-9F, 4.5F, -1F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 131
		bodyModel[86].setRotationPoint(-9F, 5.5F, -2F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[87].setRotationPoint(-9F, 5.5F, 1F);

		bodyModel[88].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 101
		bodyModel[88].setRotationPoint(4F, 2.5F, 10F);

		bodyModel[89].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 69
		bodyModel[89].setRotationPoint(-22.75F, 2.75F, -2F);

		bodyModel[90].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 143
		bodyModel[90].setRotationPoint(18.75F, 2.75F, -2F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 126
		bodyModel[91].setRotationPoint(30F, 1F, -9F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 127
		bodyModel[92].setRotationPoint(30F, 1F, 6F);

		bodyModel[93].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Box 128
		bodyModel[93].setRotationPoint(9F, 3.5F, -3F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 129
		bodyModel[94].setRotationPoint(-22.25F, 2F, -10F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 130
		bodyModel[95].setRotationPoint(-22.25F, 2F, 6F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 131
		bodyModel[96].setRotationPoint(19.25F, 2F, 6F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 132
		bodyModel[97].setRotationPoint(19.25F, 2F, -10F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 133
		bodyModel[98].setRotationPoint(-21.25F, 2F, -11F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 134
		bodyModel[99].setRotationPoint(-21.25F, 2F, 9F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 135
		bodyModel[100].setRotationPoint(20.25F, 2F, -11F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 136
		bodyModel[101].setRotationPoint(20.25F, 2F, 9F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 3, 12, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[102].setRotationPoint(31F, -20F, 1F);

		bodyModel[103].addBox(0F, 0F, 0F, 3, 21, 2, 0F); // Box 263
		bodyModel[103].setRotationPoint(31F, -20F, -1F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 3, 21, 6, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[104].setRotationPoint(31F, -20F, -7F);

		bodyModel[105].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 265
		bodyModel[105].setRotationPoint(33.5F, -18.5F, -1F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 Headlight Rear
		bodyModel[106].setRotationPoint(33.75F, -18.5F, -1F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 Headlight Rear
		bodyModel[107].setRotationPoint(33.75F, -16.5F, -1F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[108].setRotationPoint(31F, -1F, 1F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		bodyModel[109].setRotationPoint(31F, -8F, 1F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[110].setRotationPoint(31F, -8F, 5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[111].setRotationPoint(30.75F, -7F, 3.5F);

		bodyModel[112].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 43
		bodyModel[112].setRotationPoint(30.75F, -5F, 4F);

		bodyModel[113].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 333
		bodyModel[113].setRotationPoint(33F, -20.5F, -2F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 334 Rear Gyralight L
		bodyModel[114].setRotationPoint(34.25F, -20.5F, -2F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 335 Rear Gyralight R
		bodyModel[115].setRotationPoint(34.25F, -20.5F, 0F);

		bodyModel[116].addBox(0F, 0F, 0F, 1, 7, 0, 0F); // Box 601
		bodyModel[116].setRotationPoint(33F, -8F, 2.75F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 402
		bodyModel[117].setRotationPoint(30.5F, -20.5F, -1F);

		bodyModel[118].addBox(-1F, 0F, 0F, 1, 2, 5, 0F); // Box 117 Numberboard R
		bodyModel[118].setRotationPoint(31.51F, -17.5F, -6F);
		bodyModel[118].rotateAngleY = -0.4712389F;

		bodyModel[119].addBox(-1F, 0F, -5F, 1, 2, 5, 0F); // Box 118 Numberboard R
		bodyModel[119].setRotationPoint(31.51F, -17.5F, 6F);
		bodyModel[119].rotateAngleY = 0.4712389F;

		bodyModel[120].addBox(0F, 0F, 0F, 42, 20, 14, 0F); // Box 51
		bodyModel[120].setRotationPoint(-11F, -20F, -7F);

		bodyModel[121].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 78
		bodyModel[121].setRotationPoint(-10F, -20.75F, -3F);

		bodyModel[122].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 319
		bodyModel[122].setRotationPoint(-3F, -20.75F, -3F);

		bodyModel[123].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 320
		bodyModel[123].setRotationPoint(16F, -20.75F, -3F);

		bodyModel[124].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 321
		bodyModel[124].setRotationPoint(23F, -20.75F, -3F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 153 stack 1
		bodyModel[125].setRotationPoint(5.5F, -22F, -1.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 154 stack 2
		bodyModel[126].setRotationPoint(8.25F, -22F, -1.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 155 stack 3
		bodyModel[127].setRotationPoint(10.75F, -22F, -1.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 156 stack 4
		bodyModel[128].setRotationPoint(13.5F, -22F, -1.5F);

		bodyModel[129].addBox(-0.5F, 0F, -0.5F, 1, 13, 4, 0F); // Box 52 door swing right
		bodyModel[129].setRotationPoint(-25.5F, -18F, -9.5F);

		bodyModel[130].addBox(0F, 0F, 0F, 15, 1, 18, 0F); // Box 68
		bodyModel[130].setRotationPoint(-26F, -22F, -9F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 15, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[131].setRotationPoint(-26F, -22F, 9F);

		bodyModel[132].addBox(0F, 0F, 0F, 1, 13, 17, 0F); // Box 70
		bodyModel[132].setRotationPoint(-12F, -18F, -10F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 74
		bodyModel[133].setRotationPoint(-29F, -22F, -1F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[134].setRotationPoint(-28F, -22F, -6F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 76
		bodyModel[135].setRotationPoint(-28F, -22F, 1F);

		bodyModel[136].addBox(0F, 0F, 0F, 14, 13, 1, 0F); // Box 72
		bodyModel[136].setRotationPoint(-26F, -18F, 10F);

		bodyModel[137].addBox(0F, 0F, 0F, 15, 13, 1, 0F); // Box 190
		bodyModel[137].setRotationPoint(-26F, -18F, -11F);

		bodyModel[138].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 117 Numberboard
		bodyModel[138].setRotationPoint(-26.05F, -21F, -6F);
		bodyModel[138].rotateAngleY = 0.38397244F;

		bodyModel[139].addBox(0F, 0F, -5F, 1, 2, 5, 0F); // Box 118 Numberboard
		bodyModel[139].setRotationPoint(-26.05F, -21F, 6F);
		bodyModel[139].rotateAngleY = -0.38397244F;

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 Headlight Front
		bodyModel[140].setRotationPoint(-28.75F, -22F, -1F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 Headlight Front
		bodyModel[141].setRotationPoint(-28.75F, -20F, -1F);

		bodyModel[142].addBox(0F, 0F, 0F, 1, 13, 16, 0F); // Box 313
		bodyModel[142].setRotationPoint(-26F, -18F, -6F);

		bodyModel[143].addBox(-0.5F, 0F, -3.5F, 1, 13, 4, 0F); // Box 314 door swing right
		bodyModel[143].setRotationPoint(-11.5F, -18F, 10.5F);

		bodyModel[144].addBox(0F, 0F, 0F, 15, 5, 22, 0F); // Box 316
		bodyModel[144].setRotationPoint(-26F, -5F, -11F);

		bodyModel[145].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 332
		bodyModel[145].setRotationPoint(-26F, -21F, -9F);

		bodyModel[146].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 333
		bodyModel[146].setRotationPoint(-12F, -21F, -9F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 15, 4, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[147].setRotationPoint(-26F, -22F, -11F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 13, 3, 3, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		bodyModel[148].setRotationPoint(-25F, -21F, 6F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 13, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
		bodyModel[149].setRotationPoint(-25F, -21F, -9F);

		bodyModel[150].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 106
		bodyModel[150].setRotationPoint(-31F, -5F, -11.01F);

		bodyModel[151].addBox(0F, 0F, 0F, 0, 16, 2, 0F); // Box 81
		bodyModel[151].setRotationPoint(-31.5F, -11F, -11F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81
		bodyModel[152].setRotationPoint(-31.5F, -5F, -11.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 176
		bodyModel[153].setRotationPoint(-31.5F, -5F, 10.5F);

		bodyModel[154].addBox(0F, 0F, 0F, 0, 18, 2, 0F); // Box 177
		bodyModel[154].setRotationPoint(-31.5F, -13F, 9F);

		bodyModel[155].addBox(0F, 0F, 0F, 3, 4, 5, 0F); // Box 193
		bodyModel[155].setRotationPoint(-29F, -4F, -11F);

		bodyModel[156].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 343
		bodyModel[156].setRotationPoint(-30F, -2F, -11F);

		bodyModel[157].addBox(0F, 0F, 0F, 5, 2, 5, 0F); // Box 188 high enji box
		bodyModel[157].setRotationPoint(-31F, -4F, 6F);

		bodyModel[158].addBox(0F, 0F, 0F, 5, 2, 5, 0F); // Box 73 low engi box
		bodyModel[158].setRotationPoint(-31F, -2F, 6F);

		bodyModel[159].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 61
		bodyModel[159].setRotationPoint(-31.5F, -11F, -11F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[160].setRotationPoint(-29.5F, -11F, -11F);

		bodyModel[161].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 191
		bodyModel[161].setRotationPoint(-31F, -10F, -11F);

		bodyModel[162].addBox(0F, 0F, 0F, 1, 8, 0, 0F); // Box 192
		bodyModel[162].setRotationPoint(-31F, -10F, 11F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, -0.75F, 2F, 0F, -0.75F, 2F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.25F, 0F, 0F); // Box 196
		bodyModel[163].setRotationPoint(-27.5F, -11F, 11F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 317
		bodyModel[164].setRotationPoint(-26.5F, -13F, 11F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 319
		bodyModel[165].setRotationPoint(-31.5F, -11F, 11F);

		bodyModel[166].addBox(0F, 0F, 0F, 37, 8, 0, 0F); // Box 92
		bodyModel[166].setRotationPoint(-6F, -8F, 11F);

		bodyModel[167].addBox(0F, 0F, 0F, 42, 8, 0, 0F); // Box 99
		bodyModel[167].setRotationPoint(-11F, -8F, -11F);

		bodyModel[168].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 243
		bodyModel[168].setRotationPoint(31.5F, -8F, 9F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 244
		bodyModel[169].setRotationPoint(31.5F, -6F, 10.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[170].setRotationPoint(31F, -8F, 11F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 249
		bodyModel[171].setRotationPoint(31.5F, -6F, -11.5F);

		bodyModel[172].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 250
		bodyModel[172].setRotationPoint(31.5F, -8F, -11F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[173].setRotationPoint(31F, -8F, -11F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 5, 1, 0, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[174].setRotationPoint(-31.5F, -13F, 11F);

		bodyModel[175].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 208
		bodyModel[175].setRotationPoint(-31F, -12F, 11F);

		bodyModel[176].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 61
		bodyModel[176].setRotationPoint(-36.01F, 0F, 10F);

		bodyModel[177].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 63
		bodyModel[177].setRotationPoint(-36.01F, 0F, -11F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, 1F, 0F, 0.5F); // Box 80
		bodyModel[178].setRotationPoint(-36.01F, -7F, -7F);

		bodyModel[179].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 144
		bodyModel[179].setRotationPoint(-36.01F, -7F, -8F);

		bodyModel[180].addBox(0F, 0F, 0F, 0, 8, 5, 0F); // Box 145
		bodyModel[180].setRotationPoint(-37.01F, -7F, -2.5F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[181].setRotationPoint(-36.01F, -7F, 3F);

		bodyModel[182].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 148
		bodyModel[182].setRotationPoint(-36.01F, -7F, 7F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 430
		bodyModel[183].setRotationPoint(-36.01F, -7F, -8F);
		bodyModel[183].rotateAngleY = -3.14159265F;

		bodyModel[184].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 433
		bodyModel[184].setRotationPoint(-36.01F, -7F, 9F);
		bodyModel[184].rotateAngleY = -3.14159265F;

		bodyModel[185].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 222
		bodyModel[185].setRotationPoint(36.01F, -7F, -8F);
		bodyModel[185].rotateAngleY = -3.14159265F;

		bodyModel[186].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 223
		bodyModel[186].setRotationPoint(36.01F, 0F, -11F);

		bodyModel[187].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 224
		bodyModel[187].setRotationPoint(36.01F, -7F, -8F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.5F, -1F, 0F, 0.5F); // Box 225
		bodyModel[188].setRotationPoint(36.01F, -7F, -7F);

		bodyModel[189].addBox(0F, 0F, 0F, 0, 8, 5, 0F); // Box 226
		bodyModel[189].setRotationPoint(37.01F, -7F, -2.5F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,-1F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		bodyModel[190].setRotationPoint(36.01F, -7F, 3F);

		bodyModel[191].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 228
		bodyModel[191].setRotationPoint(36.01F, -7F, 7F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 229
		bodyModel[192].setRotationPoint(36.01F, -7F, 9F);
		bodyModel[192].rotateAngleY = -3.14159265F;

		bodyModel[193].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 230
		bodyModel[193].setRotationPoint(36.01F, 0F, 10F);

		bodyModel[194].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 336
		bodyModel[194].setRotationPoint(-29F, -24F, -2F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 337 Front Gyralight L
		bodyModel[195].setRotationPoint(-29.75F, -24F, 0F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 338 Front Gyralight R
		bodyModel[196].setRotationPoint(-29.75F, -24F, -2F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 573 Headlight Front Nose
		bodyModel[197].setRotationPoint(-33.75F, -10F, -1F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 574 nose light mount
		bodyModel[198].setRotationPoint(-34F, -12F, -1F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 575 Headlight Front Nose
		bodyModel[199].setRotationPoint(-33.75F, -12F, -1F);

		bodyModel[200].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 90
		bodyModel[200].setRotationPoint(-11F, -4F, 7F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[201].setRotationPoint(-11F, -5F, 11.01F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[202].setRotationPoint(-10F, -2F, 7F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0.25F, -0.5F, 0F, -0.25F, 2F, 0F, -0.25F, 2F, 0F, 0.25F, -0.5F, 0F); // Box 322
		bodyModel[203].setRotationPoint(-8F, -10F, 11F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-0.75F, 2F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.75F, 2F, 0F, -0.5F, -2F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.5F, -2F, 0F); // Box 244
		bodyModel[204].setRotationPoint(-11.5F, -11F, 11F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 245
		bodyModel[205].setRotationPoint(-11.5F, -13F, 11F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 246
		bodyModel[206].setRotationPoint(-9F, -10.5F, 11F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F); // Box 247
		bodyModel[207].setRotationPoint(-6.5F, -8F, 11F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 17, 8, 1, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -9F, -4F, 0F, -9F, -4F, 0F, 0F, -4F, 0F); // Box 609
		bodyModel[208].setRotationPoint(-10F, -18.5F, 6.1F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 25, 8, 1, 0F,0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -13F, -4F, 0F, -13F, -4F, 0F, 0F, -4F, 0F); // Box 610
		bodyModel[209].setRotationPoint(18F, -18.5F, 6.1F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 25, 8, 1, 0F,0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -13F, -4F, 0F, -13F, -4F, 0F, 0F, -4F, 0F); // Box 256
		bodyModel[210].setRotationPoint(18F, -18.5F, -7.1F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 17, 8, 1, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -9F, -4F, 0F, -9F, -4F, 0F, 0F, -4F, 0F); // Box 257
		bodyModel[211].setRotationPoint(-10F, -18.5F, -7.1F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[212].setRotationPoint(3F, -18F, -8.7F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[213].setRotationPoint(3F, -19F, -8.7F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[214].setRotationPoint(3.25F, -17.5F, -8.45F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 245
		bodyModel[215].setRotationPoint(3F, -20F, -8.5F);

		bodyModel[216].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 327
		bodyModel[216].setRotationPoint(0.5F, -21.5F, -8F);

		bodyModel[217].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 328
		bodyModel[217].setRotationPoint(1.5F, -21.25F, -7F);

		bodyModel[218].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 329
		bodyModel[218].setRotationPoint(1F, -21.25F, -9F);

		bodyModel[219].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 330
		bodyModel[219].setRotationPoint(3F, -20.5F, -8F);

		bodyModel[220].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 331
		bodyModel[220].setRotationPoint(2F, -22.5F, -7.25F);

		bodyModel[221].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 332
		bodyModel[221].setRotationPoint(2F, -22.5F, -8.5F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 268
		bodyModel[222].setRotationPoint(-1F, -20F, -8.5F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		bodyModel[223].setRotationPoint(-1F, -19F, -8.7F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 270
		bodyModel[224].setRotationPoint(-1F, -18F, -8.7F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 271
		bodyModel[225].setRotationPoint(-0.75F, -17.5F, -8.45F);

		bodyModel[226].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 391
		bodyModel[226].setRotationPoint(5.5F, -22.5F, -3F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,-0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392 cull
		bodyModel[227].setRotationPoint(5.5F, -24.5F, -3F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,-0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393 cull
		bodyModel[228].setRotationPoint(13.5F, -24.5F, -3F);

		bodyModel[229].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 394
		bodyModel[229].setRotationPoint(13.5F, -22.5F, -3F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,-0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 395 cull
		bodyModel[230].setRotationPoint(10.75F, -24.5F, -3F);

		bodyModel[231].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 396
		bodyModel[231].setRotationPoint(10.75F, -22.5F, -3F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,-0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397 cull
		bodyModel[232].setRotationPoint(8.25F, -24.5F, -3F);

		bodyModel[233].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 398
		bodyModel[233].setRotationPoint(8.25F, -22.5F, -3F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 323
		bodyModel[234].setRotationPoint(3F, -18F, 7.7F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 324
		bodyModel[235].setRotationPoint(3.25F, -17.5F, 7.95F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		bodyModel[236].setRotationPoint(3F, -19F, 7.7F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 326
		bodyModel[237].setRotationPoint(3F, -20F, 7F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[238].setRotationPoint(-34.5F, 3F, 4.3F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 379
		bodyModel[239].setRotationPoint(-34.25F, 4.5F, 4.55F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 380
		bodyModel[240].setRotationPoint(-34.5F, 4F, 4.3F);

		bodyModel[241].addBox(0F, 0F, 0F, 5, 4, 8, 0F); // Box 184 o2 generator
		bodyModel[241].setRotationPoint(-21.5F, -23.75F, -4F);

		bodyModel[242].addBox(0F, 0F, 0F, 5, 2, 7, 0F); // Box 73 antenna plate cull
		bodyModel[242].setRotationPoint(-27F, -24F, -5F);

		bodyModel[243].addBox(0F, 0F, 0F, 5, 2, 6, 0F); // Box 282 antenna plate cull
		bodyModel[243].setRotationPoint(-16F, -24F, -6F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[244].setRotationPoint(-26F, -25F, -3F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[245].setRotationPoint(-15F, -25F, -5F);

		bodyModel[246].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 301
		bodyModel[246].setRotationPoint(-20F, -24F, 7F);

		bodyModel[247].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 302
		bodyModel[247].setRotationPoint(-18F, -23F, 7F);

		bodyModel[248].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 307
		bodyModel[248].setRotationPoint(-15F, -24F, 2F);

		bodyModel[249].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 308
		bodyModel[249].setRotationPoint(-13F, -23F, 1F);

		bodyModel[250].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 309
		bodyModel[250].setRotationPoint(-13F, -24F, 1F);

		bodyModel[251].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 310
		bodyModel[251].setRotationPoint(-14F, -24F, 0F);

		bodyModel[252].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 345
		bodyModel[252].setRotationPoint(-25F, -26F, 0F);

		bodyModel[253].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 401
		bodyModel[253].setRotationPoint(-15F, -24F, -8F);

		bodyModel[254].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 402
		bodyModel[254].setRotationPoint(-15F, -23F, -8F);

		bodyModel[255].addBox(0F, 0F, 0F, 16, 2, 2, 0F); // Box 360 torpedo tueb
		bodyModel[255].setRotationPoint(1F, -22.5F, 4F);

		bodyModel[256].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 361
		bodyModel[256].setRotationPoint(0.99F, -21.5F, 4.5F);

		bodyModel[257].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 362
		bodyModel[257].setRotationPoint(17.01F, -21.5F, 4.5F);

		bodyModel[258].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 363
		bodyModel[258].setRotationPoint(0.99F, -21.5F, -5.5F);

		bodyModel[259].addBox(0F, 0F, 0F, 16, 2, 2, 0F); // Box 364 torpedo tueb
		bodyModel[259].setRotationPoint(1F, -22.5F, -6F);

		bodyModel[260].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 365
		bodyModel[260].setRotationPoint(17.01F, -21.5F, -5.5F);

		bodyModel[261].addBox(0F, 0F, 0F, 7, 3, 7, 0F); // Box 196 winterization hatch cull
		bodyModel[261].setRotationPoint(15.5F, -22.5F, -3.5F);

		bodyModel[262].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 275 amtrak horn
		bodyModel[262].setRotationPoint(-29F, -20F, 8F);

		bodyModel[263].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 276 amtrak horn
		bodyModel[263].setRotationPoint(-11F, -20F, -9F);

		bodyModel[264].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 271 cull
		bodyModel[264].setRotationPoint(-28F, -24F, 7F);

		bodyModel[265].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 272
		bodyModel[265].setRotationPoint(-25F, -24F, 6F);

		bodyModel[266].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 273
		bodyModel[266].setRotationPoint(-27F, -24F, 5F);

		bodyModel[267].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 274
		bodyModel[267].setRotationPoint(-25F, -23F, 6F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[268].setRotationPoint(-25F, -23F, -8.5F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME2-1
		bodyModel[269].setRotationPoint(-25F, -23.5F, -8.5F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME2-3
		bodyModel[270].setRotationPoint(-25F, -23.5F, -8.5F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME2-2
		bodyModel[271].setRotationPoint(-25F, -23.5F, -8.5F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME2-4
		bodyModel[272].setRotationPoint(-25F, -23.5F, -8.5F);

		bodyModel[273].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 354
		bodyModel[273].setRotationPoint(-20.5F, -23.5F, -5F);

		bodyModel[274].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 355
		bodyModel[274].setRotationPoint(-19F, -22.75F, -6F);

		bodyModel[275].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 356
		bodyModel[275].setRotationPoint(-21.5F, -23.75F, -6F);

		bodyModel[276].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 357
		bodyModel[276].setRotationPoint(-21F, -23.5F, -7F);

		bodyModel[277].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 358
		bodyModel[277].setRotationPoint(-20F, -24.75F, -6.5F);

		bodyModel[278].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 359
		bodyModel[278].setRotationPoint(-20F, -24.75F, -5.25F);

		bodyModel[279].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 346
		bodyModel[279].setRotationPoint(-26F, -24F, 7.5F);

		bodyModel[280].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 347
		bodyModel[280].setRotationPoint(-24F, -23F, 7.5F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 338 cage cull a
		bodyModel[281].setRotationPoint(-27.01F, -27.01F, 4F);

		bodyModel[282].addBox(0F, 0F, 0F, 5, 2, 4, 0F); // Box 305 cage cull b
		bodyModel[282].setRotationPoint(-27F, -24F, 4.5F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306 cage cull b
		bodyModel[283].setRotationPoint(-27F, -25F, 4.5F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[284].setRotationPoint(-36.25F, -1F, 4.75F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[285].setRotationPoint(-36.25F, -1F, -6.75F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 ditchlight f up
		bodyModel[286].setRotationPoint(-36.5F, -1F, 4.75F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight f up
		bodyModel[287].setRotationPoint(-36.5F, -1F, -6.75F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 239
		bodyModel[288].setRotationPoint(35.25F, -1F, -6.75F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 240 ditchlight r up
		bodyModel[289].setRotationPoint(35.5F, -1F, -6.75F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 241 ditchlight r up
		bodyModel[290].setRotationPoint(35.5F, -1F, 4.75F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
		bodyModel[291].setRotationPoint(35.25F, -1F, 4.75F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[292].setRotationPoint(-36F, -2F, 3.75F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[293].setRotationPoint(-36F, -2F, -5.75F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 ditchlight f up2
		bodyModel[294].setRotationPoint(-36.25F, -2F, 3.75F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight f up2
		bodyModel[295].setRotationPoint(-36.25F, -2F, -5.75F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 239
		bodyModel[296].setRotationPoint(35F, -2F, -5.75F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 24 ditchlight r up2
		bodyModel[297].setRotationPoint(35.25F, -2F, -5.75F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 241 ditchlight r up2
		bodyModel[298].setRotationPoint(35.25F, -2F, 3.75F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
		bodyModel[299].setRotationPoint(35F, -2F, 3.75F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 359 ditchlight f down3
		bodyModel[300].setRotationPoint(-37.25F, 1F, -6.75F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 360 ditchlight cull
		bodyModel[301].setRotationPoint(-37F, 1F, -6.75F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 361 ditchlight cull
		bodyModel[302].setRotationPoint(-37F, 1F, 4.75F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 362 ditchlight f down3
		bodyModel[303].setRotationPoint(-37.25F, 1F, 4.75F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[304].setRotationPoint(-36.5F, 2F, 7.25F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight f down2
		bodyModel[305].setRotationPoint(-36.75F, 2F, 7.25F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 371 ditchlight f down2
		bodyModel[306].setRotationPoint(-36.75F, 2F, -9.25F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[307].setRotationPoint(-36.5F, 2F, -9.25F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[308].setRotationPoint(-36.5F, 2.75F, 2.75F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 399 ditchlight f down
		bodyModel[309].setRotationPoint(-36.75F, 2.75F, 2.75F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 400 ditchlight f down
		bodyModel[310].setRotationPoint(-36.75F, 2.75F, -4.75F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 401
		bodyModel[311].setRotationPoint(-36.5F, 2.75F, -4.75F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 394 ditchlight r down
		bodyModel[312].setRotationPoint(35.75F, 3F, -4.75F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 395
		bodyModel[313].setRotationPoint(35.5F, 3F, -4.75F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 396 ditchlight r down
		bodyModel[314].setRotationPoint(35.75F, 3F, 2.75F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 397
		bodyModel[315].setRotationPoint(35.5F, 3F, 2.75F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 188
		bodyModel[316].setRotationPoint(35.5F, 2F, 7.25F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 190 ditchlight r down2
		bodyModel[317].setRotationPoint(35.75F, 2F, 7.25F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 371 ditchlight r down2
		bodyModel[318].setRotationPoint(35.75F, 2F, -9.25F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 372
		bodyModel[319].setRotationPoint(35.5F, 2F, -9.25F);

		bodyModel[320].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 296
		bodyModel[320].setRotationPoint(12F, -22F, -5F);

		bodyModel[321].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 341
		bodyModel[321].setRotationPoint(11F, -22.5F, -5.5F);

		bodyModel[322].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 342
		bodyModel[322].setRotationPoint(9F, -22.5F, -4.5F);

		bodyModel[323].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 343
		bodyModel[323].setRotationPoint(10F, -22.5F, -6.5F);

		bodyModel[324].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 295
		bodyModel[324].setRotationPoint(13F, -22F, -4F);

		bodyModel[325].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 297
		bodyModel[325].setRotationPoint(14F, -21F, -4F);

		bodyModel[326].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 344
		bodyModel[326].setRotationPoint(12F, -21.5F, -5.5F);

		bodyModel[327].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 294
		bodyModel[327].setRotationPoint(11F, -22F, -3F);

		bodyModel[328].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 311
		bodyModel[328].setRotationPoint(29F, -21.5F, 5F);

		bodyModel[329].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 312
		bodyModel[329].setRotationPoint(29F, -20.5F, 5F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[330].setRotationPoint(-26F, -25F, -2.5F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[331].setRotationPoint(-26F, -26F, -2.5F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		bodyModel[332].setRotationPoint(-28.5F, -24F, -1F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 353 Amtrak Red Gyro Front
		bodyModel[333].setRotationPoint(-28.75F, -24F, -1F);

		bodyModel[334].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 278
		bodyModel[334].setRotationPoint(-30F, -24.5F, -1.5F);

		bodyModel[335].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 279
		bodyModel[335].setRotationPoint(-29F, -24.5F, -0.5F);

		bodyModel[336].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 280
		bodyModel[336].setRotationPoint(-31F, -24.5F, 0.5F);

		bodyModel[337].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 281 cull
		bodyModel[337].setRotationPoint(-28F, -23.5F, -0.5F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[338].setRotationPoint(-13F, -25F, -4.5F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[339].setRotationPoint(-13F, -26F, -4.5F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[340].setRotationPoint(-14F, -23F, 5F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[341].setRotationPoint(-14F, -24F, 5F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, -2F, -1F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, -3F, -0.5F, -1F, 1F, 1F, 0F, 1F, 1F); // Box 285
		bodyModel[342].setRotationPoint(-19F, -26F, 7F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -2F, 0F, -3F, 1F, -2F, -3F, 1F, 1F, -3F, -0.5F, 0F, -3F, -3F); // Box 286
		bodyModel[343].setRotationPoint(-19F, -26F, 5F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -1F, -1.5F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F); // Box 287
		bodyModel[344].setRotationPoint(-19F, -28F, 5F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 288
		bodyModel[345].setRotationPoint(-19F, -28F, 8F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 289
		bodyModel[346].setRotationPoint(-19F, -29F, 8F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		bodyModel[347].setRotationPoint(-19F, -29F, 6F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -2F, 0F, 1F, 1F, -1F, 1F, 1F, 1F, -3F, -0.5F, 0F, 0F, -3F); // Box 393
		bodyModel[348].setRotationPoint(-19F, -26F, -10F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[349].setRotationPoint(-19F, -28F, -8F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, -2F, -1F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 1F, -3F, -0.5F, -2F, -3F, 1F, 0F, -3F, 1F); // Box 395
		bodyModel[350].setRotationPoint(-19F, -26F, -8F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 0.5F, 0F, 0F, -1F); // Box 396
		bodyModel[351].setRotationPoint(-19F, -28F, -9F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[352].setRotationPoint(-19F, -29F, -9F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[353].setRotationPoint(-19F, -29F, -8F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[354].setRotationPoint(-29F, -25F, -1F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[355].setRotationPoint(-29F, -25.5F, -1F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[356].setRotationPoint(-29F, -25.5F, -1F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[357].setRotationPoint(-29F, -25.5F, -1F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[358].setRotationPoint(-29F, -25.5F, -1F);

		bodyModel[359].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 409
		bodyModel[359].setRotationPoint(-13F, -26F, -2F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 188 not a ditchlight mount
		bodyModel[360].setRotationPoint(-36.25F, -3F, -4.75F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 mu plug
		bodyModel[361].setRotationPoint(-36.5F, -3F, -4.75F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 188 not a ditchlight mount
		bodyModel[362].setRotationPoint(35.5F, -3F, 2.75F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 190 mu plug
		bodyModel[363].setRotationPoint(35.75F, -3F, 2.75F);

		bodyModel[364].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 414
		bodyModel[364].setRotationPoint(-10F, -4F, 11.01F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 415
		bodyModel[365].setRotationPoint(-37.25F, 1F, -2.5F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // DBox 89
		bodyModel[366].setRotationPoint(7.5F, -21.5F, -3F);

		bodyModel[367].addBox(0F, 0F, 0F, 6, 1, 14, 0F); // DBox 91
		bodyModel[367].setRotationPoint(7.5F, -21F, -7F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // DBox 101
		bodyModel[368].setRotationPoint(6.5F, -19F, 7F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F); // DBox 105
		bodyModel[369].setRotationPoint(2.5F, -19F, 7F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F); // DBox 172
		bodyModel[370].setRotationPoint(14.5F, -19F, 7F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // DBox 173
		bodyModel[371].setRotationPoint(6.5F, -21F, 7F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // DBox 176
		bodyModel[372].setRotationPoint(2.5F, -21F, 7F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // DBox 177
		bodyModel[373].setRotationPoint(14.5F, -21F, 7F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // DBox 178
		bodyModel[374].setRotationPoint(6.5F, -21F, -9F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // DBox 179
		bodyModel[375].setRotationPoint(14.5F, -21F, -9F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F); // DBox 180
		bodyModel[376].setRotationPoint(14.5F, -19F, -9F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // DBox 181
		bodyModel[377].setRotationPoint(6.5F, -19F, -9F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1.5F, 0F); // DBox 182
		bodyModel[378].setRotationPoint(2.5F, -19F, -9F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // DBox 183
		bodyModel[379].setRotationPoint(2.5F, -21F, -9F);

		bodyModel[380].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 361
		bodyModel[380].setRotationPoint(-3.5F, -22F, -6F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 362
		bodyModel[381].setRotationPoint(-3F, -21F, -7F);

		bodyModel[382].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 363
		bodyModel[382].setRotationPoint(-4.5F, -22F, -5F);

		bodyModel[383].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 364
		bodyModel[383].setRotationPoint(-5F, -22F, -7F);

		bodyModel[384].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 350
		bodyModel[384].setRotationPoint(-25F, -16F, -12F);

		bodyModel[385].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 351
		bodyModel[385].setRotationPoint(-25F, -16F, 11F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[386].setRotationPoint(-25F, -18F, 11F);
		bodyModel[386].rotateAngleX = 0.26179939F;

		bodyModel[387].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[387].setRotationPoint(-25F, -18.25F, -11.97F);
		bodyModel[387].rotateAngleX = -0.26179939F;

		bodyModel[388].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[388].setRotationPoint(-24F, -18F, 11F);
		bodyModel[388].rotateAngleX = 0.26179939F;

		bodyModel[389].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[389].setRotationPoint(-24F, -18.25F, -11.97F);
		bodyModel[389].rotateAngleX = -0.26179939F;

		bodyModel[390].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 238 m&d 2632 moment
		bodyModel[390].setRotationPoint(4F, -20F, -10F);

		bodyModel[391].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 239 m&d 2632 moment
		bodyModel[391].setRotationPoint(4F, -20F, -9F);

		bodyModel[392].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 244 m&d 2632 moment
		bodyModel[392].setRotationPoint(2.75F, -21F, -9.75F);

		bodyModel[393].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 245 m&d 2632 moment
		bodyModel[393].setRotationPoint(4.25F, -19F, -9.75F);

		bodyModel[394].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 444
		bodyModel[394].setRotationPoint(-25F, -23.5F, -8.5F);

		bodyModel[395].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 445
		bodyModel[395].setRotationPoint(-26F, -24.5F, -8.5F);

		bodyModel[396].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 446
		bodyModel[396].setRotationPoint(-27F, -24.5F, -9.5F);

		bodyModel[397].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 447
		bodyModel[397].setRotationPoint(-28F, -24.5F, -7.5F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 448
		bodyModel[398].setRotationPoint(-27F, -23F, 0F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 22
		bodyModel[399].setRotationPoint(-40F, 7.5F, 0F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[400].setRotationPoint(-40F, 7.5F, -10F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 1F, 0F, -2.5F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 24
		bodyModel[401].setRotationPoint(-39F, 6.5F, 0F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[402].setRotationPoint(-39F, 6.5F, -10F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 431
		bodyModel[403].setRotationPoint(39F, 7.5F, 0F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 432
		bodyModel[404].setRotationPoint(39F, 7.5F, -10F);

		bodyModel[405].addShapeBox(-1F, 0F, 0F, 1, 1, 10, 0F,2F, 1F, 0F, -2.5F, 1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 433
		bodyModel[405].setRotationPoint(39F, 6.5F, -10F);

		bodyModel[406].addShapeBox(-1F, 0F, 0F, 1, 1, 10, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 434
		bodyModel[406].setRotationPoint(39F, 6.5F, 0F);

		bodyModel[407].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 435
		bodyModel[407].setRotationPoint(-28F, -24F, -1F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[408].setRotationPoint(-39F, 6.5F, 0F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[409].setRotationPoint(-39F, 6.5F, -10F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 1F, 0F, -2.5F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 438
		bodyModel[410].setRotationPoint(-39F, 5.5F, 0F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 439
		bodyModel[411].setRotationPoint(-39F, 5.5F, -10F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 440
		bodyModel[412].setRotationPoint(38F, 6.5F, 0F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 441
		bodyModel[413].setRotationPoint(38F, 6.5F, -10F);

		bodyModel[414].addShapeBox(-1F, 0F, 0F, 1, 1, 10, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 442
		bodyModel[414].setRotationPoint(39F, 5.5F, 0F);

		bodyModel[415].addShapeBox(-1F, 0F, 0F, 1, 1, 10, 0F,2F, 1F, 0F, -2.5F, 1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 443
		bodyModel[415].setRotationPoint(39F, 5.5F, -10F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[416].setRotationPoint(-20F, -23F, -0.5F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[417].setRotationPoint(-20F, -24F, -0.5F);

		bodyModel[418].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 446
		bodyModel[418].setRotationPoint(-25F, -24F, 3F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[419].setRotationPoint(-25F, -23F, -4.5F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[420].setRotationPoint(-25F, -24F, -4.5F);

		bodyModel[421].addBox(0F, 0F, 0F, 5, 2, 5, 0F); // Box 282 antenna plate cull
		bodyModel[421].setRotationPoint(-16F, -24F, -2.5F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		bodyModel[422].setRotationPoint(-15F, -25F, 0F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[423].setRotationPoint(-26F, -25F, -1F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME3-1
		bodyModel[424].setRotationPoint(-26F, -25.5F, -1F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME3-3
		bodyModel[425].setRotationPoint(-26F, -25.5F, -1F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME3-2
		bodyModel[426].setRotationPoint(-26F, -25.5F, -1F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME3-4
		bodyModel[427].setRotationPoint(-26F, -25.5F, -1F);

		bodyModel[428].addBox(0F, 0F, 0F, 5, 2, 6, 0F); // Box 73 antenna plate cull
		bodyModel[428].setRotationPoint(-27F, -24F, -3F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 457
		bodyModel[429].setRotationPoint(-26F, -25F, 0F);

		bodyModel[430].addBox(0.5F, 0F, 0.5F, 4, 9, 3, 0F); // Box 412 cs1
		bodyModel[430].setRotationPoint(-20F, -14F, -7F);
		bodyModel[430].rotateAngleY = -0.26179939F;

		bodyModel[431].addBox(0F, 0F, 0F, 6, 7, 3, 0F); // Box 413 cs1
		bodyModel[431].setRotationPoint(-25.1F, -12F, -3F);
		bodyModel[431].rotateAngleY = -0.59341195F;

		bodyModel[432].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, 0F, -6F, -2F, 0F, -6F, -2F, 0.5F, 0F, -2F, 0.5F); // Box 86 cs1
		bodyModel[432].setRotationPoint(-25.1F, -14F, -3F);
		bodyModel[432].rotateAngleY = -0.59341195F;

		bodyModel[433].addBox(0F, 0F, 0F, 3, 7, 0, 0F); // Box 461 nose stairs hand rail inside your ass
		bodyModel[433].setRotationPoint(-25F, -12F, -4F);

		bodyModel[434].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 462 smol antenna plane cull
		bodyModel[434].setRotationPoint(-14F, -23F, -1.5F);

		bodyModel[435].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 463
		bodyModel[435].setRotationPoint(-13F, -25F, 0F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[436].setRotationPoint(-28F, -24.5F, -0.5F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[437].setRotationPoint(-28F, -25.5F, -0.5F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F); // Box 131 cs2
		bodyModel[438].setRotationPoint(-24F, -12F, 1.5F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,-0.2F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.1F, 0.5F, -0.2F, -0.1F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F); // Box 131 cs2
		bodyModel[439].setRotationPoint(-24.5F, -10F, 1F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 131 cs2
		bodyModel[440].setRotationPoint(-21F, -12F, -5F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131 cs2
		bodyModel[441].setRotationPoint(-22F, -12F, -6F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 131 cs2
		bodyModel[442].setRotationPoint(-23F, -12F, -5F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.15F, -0.75F, -1F, -1F, -0.75F, 0.15F, 0.15F, -0.75F, -1F, -1F, -0.75F, 0.15F, 0.15F, 0F, -1F, -1F, 0F, 0.15F, 0.15F, 0F, -1F, -1F, 0F, 0.15F); // Box 131 cs2
		bodyModel[443].setRotationPoint(-22.5F, -14F, -5.5F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,-0.5F, 0F, -1.25F, -1.5F, 0F, 0.25F, -0.25F, 0F, -1.25F, -1.25F, 0F, 0.25F, -0.5F, 0F, -1.25F, -1.5F, 0F, 0.25F, -0.25F, 0F, -1.25F, -1.25F, 0F, 0.25F); // Box 131 cs2
		bodyModel[444].setRotationPoint(-25.5F, -14.5F, -1.25F);

		bodyModel[445].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 360 cs2
		bodyModel[445].setRotationPoint(-25F, -9.3F, -2.5F);

		bodyModel[446].addShapeBox(0.5F, 0F, 0.5F, 4, 2, 3, 0F,0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 476 cs1 radio
		bodyModel[446].setRotationPoint(-20F, -16F, -7F);
		bodyModel[446].rotateAngleY = -0.26179939F;

		bodyModel[447].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 478
		bodyModel[447].setRotationPoint(-31F, -14F, -0.5F);

		bodyModel[448].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 479
		bodyModel[448].setRotationPoint(-33F, -14.75F, -1.5F);

		bodyModel[449].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 480
		bodyModel[449].setRotationPoint(-33.5F, -15F, -0.5F);

		bodyModel[450].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 481
		bodyModel[450].setRotationPoint(-32.5F, -14.75F, 0.5F);

		bodyModel[451].addBox(0F, 0F, 0F, 1, 16, 12, 0F); // Box 482
		bodyModel[451].setRotationPoint(-13F, -21F, -6F);

		bodyModel[452].addBox(0F, 0F, 0F, 6, 2, 4, 0F); // Box 364
		bodyModel[452].setRotationPoint(-23.5F, -24F, -2F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[453].setRotationPoint(-24.5F, -24F, -2F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 366
		bodyModel[454].setRotationPoint(-24.5F, -23F, -2F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 490 TXR bell
		bodyModel[455].setRotationPoint(-10.5F, 4F, 9.5F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 491 TXR bell
		bodyModel[456].setRotationPoint(-10.5F, 5F, 9.5F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 492 TXR bell
		bodyModel[457].setRotationPoint(-10.25F, 5.5F, 9.75F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 493 TXR bell sponson
		bodyModel[458].setRotationPoint(-10.5F, 3F, 9.5F);

		bodyModel[459].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 299
		bodyModel[459].setRotationPoint(-20F, -24F, -8F);

		bodyModel[460].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 300
		bodyModel[460].setRotationPoint(-20F, -23F, -8F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 7, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull AWW 2window
		bodyModel[461].setRotationPoint(-25F, -17F, 10F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5 AWW 2window
		bodyModel[462].setRotationPoint(-25F, -18F, 10F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 7, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 412 cull AWW 1window
		bodyModel[463].setRotationPoint(-24F, -17F, 10F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 413 AWW 1window
		bodyModel[464].setRotationPoint(-24F, -18F, 10F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 0, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 616
		bodyModel[465].setRotationPoint(31F, 2F, -11F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 0, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F); // Box 617
		bodyModel[466].setRotationPoint(31F, 4F, -9F);
		bodyModel[466].rotateAngleY = -0.5846853F;

		bodyModel[467].addShapeBox(0F, 0F, 0F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 618
		bodyModel[467].setRotationPoint(31F, 2F, -9F);
		bodyModel[467].rotateAngleY = -0.5846853F;

		bodyModel[468].addShapeBox(0F, 0F, 0F, 0, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 619
		bodyModel[468].setRotationPoint(31F, 2F, 9F);

		bodyModel[469].addShapeBox(0F, 0F, -4F, 0, 2, 4, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 620
		bodyModel[469].setRotationPoint(31F, 2F, 9F);
		bodyModel[469].rotateAngleY = 0.5846853F;

		bodyModel[470].addShapeBox(0F, 0F, -4F, 0, 5, 4, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 621
		bodyModel[470].setRotationPoint(31F, 4F, 9F);
		bodyModel[470].rotateAngleY = 0.5846853F;

		bodyModel[471].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 622
		bodyModel[471].setRotationPoint(29F, 2F, 11F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 623
		bodyModel[472].setRotationPoint(29F, 2F, -11F);

		bodyModel[473].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 624
		bodyModel[473].setRotationPoint(31F, 7.5F, -9F);

		bodyModel[474].addBox(0F, 0F, 0F, 5, 0, 2, 0F); // Box 625
		bodyModel[474].setRotationPoint(31F, 8.5F, -11F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 5, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.325F, 0F, 0F); // Box 626
		bodyModel[475].setRotationPoint(31F, 6.25F, -9F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,-0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F); // Box 627
		bodyModel[476].setRotationPoint(32F, 5.25F, -7F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F); // Box 628
		bodyModel[477].setRotationPoint(32F, 4.5F, -8.5F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,-0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F); // Box 629
		bodyModel[478].setRotationPoint(32F, 3.5F, -6.5F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F); // Box 630
		bodyModel[479].setRotationPoint(33F, 2.75F, -7.5F);

		bodyModel[480].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 631
		bodyModel[480].setRotationPoint(31F, 7.5F, 9F);

		bodyModel[481].addBox(0F, 0F, 0F, 5, 0, 2, 0F); // Box 632
		bodyModel[481].setRotationPoint(31F, 8.5F, 9F);

		bodyModel[482].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,-0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F); // Box 633
		bodyModel[482].setRotationPoint(32F, 5.25F, 7F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 5, 0, 2, 0F,-1.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 634
		bodyModel[483].setRotationPoint(31F, 6.25F, 7F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,-0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F); // Box 635
		bodyModel[484].setRotationPoint(32F, 3.5F, 6.5F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F); // Box 636
		bodyModel[485].setRotationPoint(32F, 4.5F, 6.5F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,-0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 637
		bodyModel[486].setRotationPoint(33F, 2.75F, 5.5F);

		bodyModel[487].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 488 handrail extension cull
		bodyModel[487].setRotationPoint(-6F, 0.5F, 10F);

		bodyModel[488].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 488 handrail extension cull
		bodyModel[488].setRotationPoint(-6F, 0.5F, -11F);

		bodyModel[489].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[489].setRotationPoint(-14F, -25F, -1F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME4-1
		bodyModel[490].setRotationPoint(-14F, -25.5F, -1F);

		bodyModel[491].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME4-3
		bodyModel[491].setRotationPoint(-14F, -25.5F, -1F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME4-2
		bodyModel[492].setRotationPoint(-14F, -25.5F, -1F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME4-4
		bodyModel[493].setRotationPoint(-14F, -25.5F, -1F);

		bodyModel[494].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 487 cab heater
		bodyModel[494].setRotationPoint(-25F, -10F, -6F);

		bodyModel[495].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 495
		bodyModel[495].setRotationPoint(-15.5F, -24F, -9F);

		bodyModel[496].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 496
		bodyModel[496].setRotationPoint(-15.5F, -24F, -7F);

		bodyModel[497].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 497
		bodyModel[497].setRotationPoint(-15F, -25F, -8.5F);

		bodyModel[498].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 498
		bodyModel[498].setRotationPoint(-15.5F, -25F, -7.5F);

		bodyModel[499].addShapeBox(0F, 0F, 0F, 7, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull AWW 2window
		bodyModel[499].setRotationPoint(-18F, -17F, -10F);
		bodyModel[499].rotateAngleY = -3.14159265F;
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 489, 201, textureX, textureY); // Box 5 AWW 2window
		bodyModel[501] = new ModelRendererTurbo(this, 462, 206, textureX, textureY, "cull"); // Box 412 cull AWW 1window
		bodyModel[502] = new ModelRendererTurbo(this, 464, 201, textureX, textureY); // Box 413 AWW 1window
		bodyModel[503] = new ModelRendererTurbo(this, 277, 220, textureX, textureY); // Box 503 tcw moment
		bodyModel[504] = new ModelRendererTurbo(this, 276, 220, textureX, textureY); // Box 504 tcw moment
		bodyModel[505] = new ModelRendererTurbo(this, 382, 177, textureX, textureY); // Box 409 commander base
		bodyModel[506] = new ModelRendererTurbo(this, 387, 176, textureX, textureY, "lamp"); // Box 410 commander beacon
		bodyModel[507] = new ModelRendererTurbo(this, 220, 246, textureX, textureY); // Box 526
		bodyModel[508] = new ModelRendererTurbo(this, 220, 246, textureX, textureY); // Box 527
		bodyModel[509] = new ModelRendererTurbo(this, 213, 246, textureX, textureY); // Box 528 kartrak my beloved
		bodyModel[510] = new ModelRendererTurbo(this, 213, 246, textureX, textureY); // Box 529 kartrak my beloved
		bodyModel[511] = new ModelRendererTurbo(this, 241, 66, textureX, textureY, "cull"); // Box 522 tall arrestor cull
		bodyModel[512] = new ModelRendererTurbo(this, 247, 60, textureX, textureY); // Box 523
		bodyModel[513] = new ModelRendererTurbo(this, 241, 66, textureX, textureY, "cull"); // Box 522 tall arrestor cull
		bodyModel[514] = new ModelRendererTurbo(this, 247, 60, textureX, textureY); // Box 523
		bodyModel[515] = new ModelRendererTurbo(this, 266, 66, textureX, textureY, "cull"); // Box 522 tall arrestor cull
		bodyModel[516] = new ModelRendererTurbo(this, 272, 60, textureX, textureY); // Box 523
		bodyModel[517] = new ModelRendererTurbo(this, 266, 66, textureX, textureY, "cull"); // Box 522 tall arrestor cull
		bodyModel[518] = new ModelRendererTurbo(this, 272, 60, textureX, textureY); // Box 523

		bodyModel[500].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5 AWW 2window
		bodyModel[500].setRotationPoint(-18F, -18F, -10F);
		bodyModel[500].rotateAngleY = -3.14159265F;

		bodyModel[501].addShapeBox(0F, 0F, 0F, 7, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 412 cull AWW 1window
		bodyModel[501].setRotationPoint(-17F, -17F, -10F);
		bodyModel[501].rotateAngleY = -3.14159265F;

		bodyModel[502].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 413 AWW 1window
		bodyModel[502].setRotationPoint(-17F, -18F, -10F);
		bodyModel[502].rotateAngleY = -3.14159265F;

		bodyModel[503].addBox(0F, 0F, 0F, 2, 3, 4, 0F); // Box 503 tcw moment
		bodyModel[503].setRotationPoint(-11F, -11F, -11F);

		bodyModel[504].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 504 tcw moment
		bodyModel[504].setRotationPoint(-11F, -8F, -10.99F);

		bodyModel[505].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[505].setRotationPoint(-27F, -23F, -0.5F);

		bodyModel[506].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[506].setRotationPoint(-27F, -24F, -0.5F);

		bodyModel[507].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 526
		bodyModel[507].setRotationPoint(3F, 0.5F, 9.95F);

		bodyModel[508].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 527
		bodyModel[508].setRotationPoint(3F, 0.5F, -10.95F);

		bodyModel[509].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 528 kartrak my beloved
		bodyModel[509].setRotationPoint(-3.5F, 0.5F, 9.75F);

		bodyModel[510].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 529 kartrak my beloved
		bodyModel[510].setRotationPoint(-3.5F, 0.5F, -10.75F);

		bodyModel[511].addShapeBox(0F, 0F, 0F, 4, 8, 8, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, -4F, 0F, -4F, -4F); // Box 522 tall arrestor cull
		bodyModel[511].setRotationPoint(5.5F, -24F, -2F);

		bodyModel[512].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 523
		bodyModel[512].setRotationPoint(5.5F, -25F, -2F);

		bodyModel[513].addShapeBox(0F, 0F, 0F, 4, 8, 8, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, -4F, 0F, -4F, -4F); // Box 522 tall arrestor cull
		bodyModel[513].setRotationPoint(13.5F, -24F, -2F);

		bodyModel[514].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 523
		bodyModel[514].setRotationPoint(13.5F, -25F, -2F);

		bodyModel[515].addShapeBox(0F, 0F, 0F, 4, 8, 8, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, -4F, 0F, -4F, -4F); // Box 522 tall arrestor cull
		bodyModel[515].setRotationPoint(8.25F, -24F, -2F);

		bodyModel[516].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 523
		bodyModel[516].setRotationPoint(8.25F, -25F, -2F);

		bodyModel[517].addShapeBox(0F, 0F, 0F, 4, 8, 8, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, -4F, 0F, -4F, -4F); // Box 522 tall arrestor cull
		bodyModel[517].setRotationPoint(10.75F, -24F, -2F);

		bodyModel[518].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 523
		bodyModel[518].setRotationPoint(10.75F, -25F, -2F);
	}
	ModelBapBlombergB theBlomb = new ModelBapBlombergB();
	ModelTypeB theB = new ModelTypeB();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 519; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp") ) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				bodyModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			}else if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}
		}
		if (entity instanceof AbstractTrains && DepreciatedUtil.getColorFromString(((AbstractTrains) entity).getColor()) == 11||entity instanceof AbstractTrains && DepreciatedUtil.getColorFromString(((AbstractTrains) entity).getColor()) == 5
				||entity instanceof AbstractTrains && DepreciatedUtil.getColorFromString(((AbstractTrains) entity).getColor()) == 17||entity instanceof AbstractTrains && DepreciatedUtil.getColorFromString(((AbstractTrains) entity).getColor()) == 19
				||entity instanceof AbstractTrains && DepreciatedUtil.getColorFromString(((AbstractTrains) entity).getColor()) == 21||entity instanceof AbstractTrains && DepreciatedUtil.getColorFromString(((AbstractTrains) entity).getColor()) == 22
				||entity instanceof AbstractTrains && DepreciatedUtil.getColorFromString(((AbstractTrains) entity).getColor()) == 20||entity instanceof AbstractTrains && DepreciatedUtil.getColorFromString(((AbstractTrains) entity).getColor()) == 6
				||entity instanceof AbstractTrains && DepreciatedUtil.getColorFromString(((AbstractTrains) entity).getColor()) == 13
		) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_Grey.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.28, 0.17, 0);
			theBlomb.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.55, 0, 0);
			theBlomb.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (entity instanceof AbstractTrains && DepreciatedUtil.getColorFromString(((AbstractTrains) entity).getColor()) == 23||entity instanceof AbstractTrains && DepreciatedUtil.getColorFromString(((AbstractTrains) entity).getColor()) == 7) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_DarkerGrey.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.28, 0.17, 0);
			theBlomb.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.55, 0, 0);
			theBlomb.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (entity instanceof AbstractTrains && DepreciatedUtil.getColorFromString(((AbstractTrains) entity).getColor()) == 1340) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_spooki_up_trash.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.28, 0.17, 0);
			theBlomb.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.55, 0, 0);
			theBlomb.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (entity instanceof AbstractTrains && DepreciatedUtil.getColorFromString(((AbstractTrains) entity).getColor()) == 7324||entity instanceof AbstractTrains && DepreciatedUtil.getColorFromString(((AbstractTrains) entity).getColor()) == 15) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/typeb_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.3, 	0.325, 0);
			theB.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.57, 0, 0);
			theB.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.28, 0.17, 0);
			theBlomb.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.55, 0, 0);
			theBlomb.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}

	public float[] getTrans() {
		return new float[]{-1.25F, 0.15F, 0.00F};
	}

	public float[] getRotate() {
		return new float[] { 0F, 180F, 180F };
	}

	public float[] getScale() {
		return null;
	}

	public ArrayList<double[]> getSmokePosition() {
		return new ArrayList<double[]>() {
			{
				add(new double[]{0.35D, 1.4D, 0.0D});//rear
				add(new double[]{0.85D, 1.4D, 0.0D});//front
			}
		};
	}
}